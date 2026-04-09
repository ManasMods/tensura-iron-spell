package io.github.manasmods.tensura_iron.neoforge.mixin;

import io.github.manasmods.tensura.ability.SkillUtils;
import io.redspace.ironsspellbooks.effect.EvasionEffect;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EvasionEffect.class)
public class MixinEvasionEffect {

    @Inject(at = @At(value = "HEAD"), method = "doEffect", remap = false, cancellable = true)
    private static void doEffect(LivingEntity entity, DamageSource damageSource, CallbackInfoReturnable<Boolean> cir) {
        if (SkillUtils.shouldCancelTeleportation(entity)) {
            if (entity instanceof Player player) player.displayClientMessage(Component.translatable("tensura.skill.spatial_blockade").setStyle(Style.EMPTY.withColor(ChatFormatting.RED)), true);
            cir.setReturnValue(false);
        }
    }
}