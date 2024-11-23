package com.github.manasmods.tensura_iron_spell.handler;

import com.github.manasmods.tensura.ability.SkillHelper;
import com.github.manasmods.tensura.ability.SkillUtils;
import com.github.manasmods.tensura.effect.template.MobEffectHelper;
import com.github.manasmods.tensura.event.EnergyRegenerateTickEvent;
import com.github.manasmods.tensura.registry.effects.TensuraMobEffects;
import com.github.manasmods.tensura_iron_spell.TensuraIronSpell;
import com.github.manasmods.tensura_iron_spell.TensuraIronSpellConfig;
import com.github.manasmods.tensura_iron_spell.data.IronSpellTags;
import io.redspace.ironsspellbooks.api.events.SpellDamageEvent;
import io.redspace.ironsspellbooks.api.events.SpellOnCastEvent;
import io.redspace.ironsspellbooks.api.events.SpellPreCastEvent;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import io.redspace.ironsspellbooks.capabilities.magic.SyncedSpellData;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = TensuraIronSpell.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ServerEventsHandler {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onSpellCast(final SpellOnCastEvent event) {
        double cost = event.getManaCost();
        if (cost <= 0) return;

        double magicule = TensuraIronSpellConfig.INSTANCE.manaConversionMultiplier.get();
        if (magicule <= 0) return;
        cost *= magicule;

        if (SkillHelper.outOfMagicule(event.getEntity(), cost)) return;
        if (magicule >= 1) event.setManaCost(0);
        else event.setManaCost((int) (event.getManaCost() - cost));
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onSpellDamage(final SpellDamageEvent event) {
        if (event.getEntity().getType().is(IronSpellTags.EntityTypes.UNAFFECTED_BY_SPELL_BOOST)) return;
        double boost = TensuraIronSpellConfig.INSTANCE.spellDamageMultiplier.get();
        if (boost <= 0 || boost == 1) return;
        event.setAmount((float) (event.getAmount() * boost));
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onMagiculeRegen(final EnergyRegenerateTickEvent.Magicule event) {
        AttributeInstance instance = event.getEntity().getAttribute(AttributeRegistry.MANA_REGEN.get());
        if (instance == null || instance.getValue() == 1) return;
        event.setValue(event.getValue() * instance.getValue());
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void preSpellCast(final SpellPreCastEvent event) {
        Player player = event.getEntity();
        if (cannotCast(player)) event.setCanceled(true);
        else if (isTeleportingMagic(event.getSpellId()) && MobEffectHelper.noTeleportation(player)) {
            player.displayClientMessage(Component.translatable("tensura.skill.spatial_blockade").setStyle(Style.EMPTY.withColor(ChatFormatting.RED)), true);
            event.setCanceled(true);
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onEvasionDamaged(final LivingAttackEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity.getLevel().isClientSide()) return;
        MagicData data = MagicData.getPlayerMagicData(entity);
        if (data.getSyncedData().hasEffect(SyncedSpellData.EVASION) && MobEffectHelper.noTeleportation(entity)) {
            entity.removeEffect(MobEffectRegistry.EVASION.get());
            if (entity instanceof Player player) player.displayClientMessage(Component.translatable("tensura.skill.spatial_blockade")
                    .setStyle(Style.EMPTY.withColor(ChatFormatting.RED)), true);

        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onEvasionDamaged(final ProjectileImpactEvent event) {
        if (event.getProjectile().getLevel().isClientSide()) return;
        if (event.getRayTraceResult() instanceof EntityHitResult result) {
            if (!(result.getEntity() instanceof LivingEntity entity)) return;
            SyncedSpellData syncedSpellData = MagicData.getPlayerMagicData(entity).getSyncedData();
            if (syncedSpellData.hasEffect(SyncedSpellData.EVASION) && MobEffectHelper.noTeleportation(entity)) {
                entity.removeEffect(MobEffectRegistry.EVASION.get());
                if (entity instanceof Player player) player.displayClientMessage(Component.translatable("tensura.skill.spatial_blockade")
                        .setStyle(Style.EMPTY.withColor(ChatFormatting.RED)), true);
            }
        }
    }

    private static boolean cannotCast(LivingEntity entity) {
        if (entity.hasEffect(TensuraMobEffects.SLEEP_MODE.get())) return true;
        if (entity.hasEffect(TensuraMobEffects.REST.get())) return true;
        if (entity.hasEffect(TensuraMobEffects.INFINITE_IMPRISONMENT.get())) return true;
        return SkillUtils.noInteractiveMode(entity);
    }

    private static boolean isTeleportingMagic(String spellId) {
        if (Objects.equals(SpellRegistry.BLOOD_STEP_SPELL.get().getSpellId(), spellId)) return true;
        if (Objects.equals(SpellRegistry.TELEPORT_SPELL.get().getSpellId(), spellId)) return true;
        if (Objects.equals(SpellRegistry.FROST_STEP_SPELL.get().getSpellId(), spellId)) return true;
        return Objects.equals(SpellRegistry.EVASION_SPELL.get().getSpellId(), spellId);
    }
}
