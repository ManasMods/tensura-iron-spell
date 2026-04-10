package io.github.manasmods.tensura_iron.neoforge.mixin;

import io.github.manasmods.tensura.ability.magic.MagicUtils;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MagicUtils.class)
public class MixinMagicUtils {
    @Inject(at = @At(value = "RETURN"), method = "getChantTime", remap = false, cancellable = true)
    private static void getChantTime(LivingEntity entity, int castTime, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue((int) Math.round(cir.getReturnValue() * (2 - entity.getAttributeValue(AttributeRegistry.CAST_TIME_REDUCTION))));
    }
}