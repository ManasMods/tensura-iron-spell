package io.github.manasmods.tensura_iron.neoforge.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import io.github.manasmods.tensura.storage.ep.ExistenceStorage;
import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ExistenceStorage.class)
public class MixinExistenceStorage {
    @WrapOperation(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;getAttributeValue(Lnet/minecraft/core/Holder;)D"),
            method = "handleMagiculeRegen", remap = false)
    private static double getAttributeValue(LivingEntity instance, Holder<Attribute> holder, Operation<Double> original) {
        double originalCost = original.call(instance, holder);
        return originalCost * instance.getAttributeValue(AttributeRegistry.MANA_REGEN);
    }
}