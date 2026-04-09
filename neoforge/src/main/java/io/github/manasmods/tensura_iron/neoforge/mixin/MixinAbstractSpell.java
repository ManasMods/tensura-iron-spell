package io.github.manasmods.tensura_iron.neoforge.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.storage.TensuraStorages;
import io.github.manasmods.tensura_iron.neoforge.IronConfig;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractSpell.class)
public class MixinAbstractSpell {

    @WrapOperation(at = @At(value = "INVOKE", target = "Lio/redspace/ironsspellbooks/api/spells/AbstractSpell;getManaCost(I)I"),
            method = "canBeCastedBy(ILio/redspace/ironsspellbooks/api/spells/CastSource;Lio/redspace/ironsspellbooks/api/magic/MagicData;Lnet/minecraft/world/entity/player/Player;)Lio/redspace/ironsspellbooks/api/spells/CastResult;", remap = false)
    private int shouldShowManaBar(AbstractSpell instance, int level, Operation<Integer> original, @Local(argsOnly = true) Player player) {
        int originalCost = original.call(instance, level);
        IronConfig config = ConfigRegistry.getConfig(IronConfig.class);
        if (config == null) return originalCost;

        double magicule = config.manaConversionMultiplier;
        if (magicule <= 0) return originalCost;
        double cost = originalCost * magicule;
        if (magicule >= 1) {
            if (TensuraStorages.getExistenceFrom(player).getMagicule() < cost) return (int) cost;
            return 0;
        }

        if (TensuraStorages.getExistenceFrom(player).getMagicule() < cost) return originalCost;
        return (int) (originalCost - cost);
    }
}