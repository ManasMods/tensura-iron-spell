package com.github.manasmods.tensura_iron_spell.core;

import com.github.manasmods.tensura.capability.race.TensuraPlayerCapability;
import com.github.manasmods.tensura.race.Race;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import top.theillusivec4.caelus.api.CaelusApi;
import top.theillusivec4.caelus.mixin.util.MixinHooks;

@Mixin(MixinHooks.class)
public class MixinMixinHooks {
    @WrapOperation(at = @At(value = "INVOKE", target = "Ltop/theillusivec4/caelus/api/CaelusApi;canFly(Lnet/minecraft/world/entity/LivingEntity;)Z"),
            method = "canFly", remap = false)
    private static boolean canFly(CaelusApi instance, LivingEntity entity, Operation<Boolean> original) {
        if (original.call(instance, entity)) return true;
        Race race = TensuraPlayerCapability.getRace(entity);
        if (race == null) return false;
        return race.canFly();
    }

    @WrapOperation(at = @At(value = "INVOKE", target = "Ltop/theillusivec4/caelus/api/CaelusApi;canFly(Lnet/minecraft/world/entity/LivingEntity;)Z"),
            method = "startFlight", remap = false)
    private static boolean startFlight(CaelusApi instance, LivingEntity entity, Operation<Boolean> original) {
        if (original.call(instance, entity)) return true;
        Race race = TensuraPlayerCapability.getRace(entity);
        if (race == null) return false;
        return race.canFly();
    }
}
