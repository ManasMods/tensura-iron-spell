package com.github.manasmods.tensura_iron_spell.core;

import com.github.manasmods.tensura.effect.template.MobEffectHelper;
import io.redspace.ironsspellbooks.capabilities.magic.PortalManager;
import io.redspace.ironsspellbooks.entity.spells.portal.PortalEntity;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PortalManager.class)
public class MixinPortalEntity {
    @Inject(method = "canUsePortal", at = @At(value = "RETURN"), remap = false, cancellable = true)
    private void canUsePortal(PortalEntity portalEntity, Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (!cir.getReturnValue()) return;
        if (entity instanceof LivingEntity living && MobEffectHelper.noTeleportation(living)) {
            if (entity instanceof Player player) player.displayClientMessage(Component.translatable("tensura.skill.spatial_blockade")
                    .setStyle(Style.EMPTY.withColor(ChatFormatting.RED)), true);
            cir.setReturnValue(false);
        }
    }
}
