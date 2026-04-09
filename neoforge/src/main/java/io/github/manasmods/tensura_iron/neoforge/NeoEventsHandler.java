package io.github.manasmods.tensura_iron.neoforge;

import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.effect.debuff.SleepEffect;
import io.github.manasmods.tensura.registry.effect.TensuraMobEffects;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura.storage.ep.ExistenceStorage;
import io.github.manasmods.tensura.util.EnergyHelper;
import io.github.manasmods.tensura_iron.TensuraIron;
import io.github.manasmods.tensura_iron.data.IronEntityTags;
import io.redspace.ironsspellbooks.api.events.SpellDamageEvent;
import io.redspace.ironsspellbooks.api.events.SpellOnCastEvent;
import io.redspace.ironsspellbooks.api.events.SpellPreCastEvent;
import io.redspace.ironsspellbooks.api.registry.SpellRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import java.util.Objects;

@EventBusSubscriber(modid = TensuraIron.MOD_ID)
public class NeoEventsHandler {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onSpellCast(final SpellOnCastEvent event) {
        double cost = event.getManaCost();
        if (cost <= 0) return;

        IronConfig config = ConfigRegistry.getConfig(IronConfig.class);
        if (config == null) return;
        double magicule = config.manaConversionMultiplier;
        if (magicule <= 0) return;
        cost *= magicule;

        if (EnergyHelper.isOutOfEnergy(event.getEntity(), 0, cost)) return;
        if (magicule >= 1) event.setManaCost(0);
        else event.setManaCost((int) (event.getManaCost() - cost));
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onSpellDamage(final SpellDamageEvent event) {
        if (event.getEntity().getType().is(IronEntityTags.IMMUNE_TO_SPELL_BOOST)) return;
        IronConfig config = ConfigRegistry.getConfig(IronConfig.class);
        if (config == null) return;
        double boost = config.spellDamageMultiplier;
        if (boost <= 0 || boost == 1) return;
        event.setAmount((float) (event.getAmount() * boost));
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void preSpellCast(final SpellPreCastEvent event) {
        Player player = event.getEntity();
        if (cannotCast(player)) event.setCanceled(true);
        else if (isTeleportingMagic(event.getSpellId()) && SkillUtils.shouldCancelTeleportation(player)) {
            player.displayClientMessage(Component.translatable("tensura.skill.spatial_blockade").setStyle(Style.EMPTY.withColor(ChatFormatting.RED)), true);
            event.setCanceled(true);
        }
    }

    public static boolean cannotCast(LivingEntity entity) {
        if (entity.isSpectator()) return true;
        if (ExistenceStorage.isInSleepMode(TensuraStorages.getExistenceFrom(entity)) || SleepEffect.isSleeping(entity)) return true;
        if (entity.hasEffect(TensuraMobEffects.getReference(TensuraMobEffects.REST))) return true;
        if (entity.hasEffect(TensuraMobEffects.getReference(TensuraMobEffects.SHADOW_STEP))) return true;
        if (entity.hasEffect(TensuraMobEffects.getReference(TensuraMobEffects.BATS_MODE))) return true;
        return entity.hasEffect(TensuraMobEffects.getReference(TensuraMobEffects.INFINITE_IMPRISONMENT));
    }

    private static boolean isTeleportingMagic(String spellId) {
        if (Objects.equals(SpellRegistry.BLOOD_STEP_SPELL.get().getSpellId(), spellId)) return true;
        if (Objects.equals(SpellRegistry.TELEPORT_SPELL.get().getSpellId(), spellId)) return true;
        if (Objects.equals(SpellRegistry.FROST_STEP_SPELL.get().getSpellId(), spellId)) return true;
        return Objects.equals(SpellRegistry.EVASION_SPELL.get().getSpellId(), spellId);
    }
}