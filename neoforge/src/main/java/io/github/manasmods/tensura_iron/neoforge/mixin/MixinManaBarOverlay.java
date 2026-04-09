package io.github.manasmods.tensura_iron.neoforge.mixin;

import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura_iron.neoforge.IronConfig;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(io.redspace.ironsspellbooks.gui.overlays.ManaBarOverlay.class)
public class MixinManaBarOverlay {
    @Inject(at = @At(value = "RETURN"), method = "shouldShowManaBar", cancellable = true, remap = false)
    private static void shouldShowManaBar(Player player, CallbackInfoReturnable<Boolean> cir) {
        IronConfig config = ConfigRegistry.getConfig(IronConfig.class);
        if (config == null) return;
        if (config.manaConversionMultiplier >= 1) cir.setReturnValue(false);
    }
}