package io.github.manasmods.tensura_iron.neoforge.mixin;

import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.resist.ColdNullification;
import io.redspace.ironsspellbooks.registries.MobEffectRegistry;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(ColdNullification.class)
public class MixinColdNullification {

    @Inject(at = @At(value = "RETURN"), method = "getImmuneEffects", cancellable = true, remap = false)
    private void isTensuraMagic(ManasSkillInstance instance, LivingEntity entity, CallbackInfoReturnable<List<Holder<MobEffect>>> cir) {
        List<Holder<MobEffect>> list = new ArrayList<>();
        if (cir.getReturnValue() != null) list.addAll(cir.getReturnValue());
        list.add(MobEffectRegistry.CHILLED);
        cir.setReturnValue(list);
    }
}