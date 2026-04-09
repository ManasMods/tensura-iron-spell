package io.github.manasmods.tensura_iron.neoforge.mixin;

import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import io.redspace.ironsspellbooks.damage.SpellDamageSource;
import net.minecraft.world.damagesource.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TensuraDamageHelper.class)
public class MixinTensuraDamageHelper {
    @Inject(at = @At(value = "RETURN"), method = "isTensuraMagic", cancellable = true, remap = false)
    private static void isTensuraMagic(DamageSource damageSource, CallbackInfoReturnable<Boolean> cir) {
        if (damageSource instanceof SpellDamageSource) cir.setReturnValue(true);
    }
}