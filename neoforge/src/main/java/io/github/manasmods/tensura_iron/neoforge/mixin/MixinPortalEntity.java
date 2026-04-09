package io.github.manasmods.tensura_iron.neoforge.mixin;

import io.github.manasmods.tensura.ability.SkillUtils;
import io.github.manasmods.tensura.data.TensuraEntityTags;
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
    @Inject(method = "canUsePortal(Lio/redspace/ironsspellbooks/entity/spells/portal/PortalEntity;Lnet/minecraft/world/entity/Entity;)Z",
            at = @At(value = "RETURN"), remap = false, cancellable = true)
    private void canUsePortal(PortalEntity portalEntity, Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (!cir.getReturnValue()) return;
        if (entity.getType().is(TensuraEntityTags.NO_FORCED_WARP)) cir.setReturnValue(false);
        else if (entity instanceof LivingEntity living && SkillUtils.shouldCancelTeleportation(living)) {
            if (entity instanceof Player player) player.displayClientMessage(Component.translatable("tensura.skill.spatial_blockade").setStyle(Style.EMPTY.withColor(ChatFormatting.RED)), true);
            cir.setReturnValue(false);
        }
    }
}