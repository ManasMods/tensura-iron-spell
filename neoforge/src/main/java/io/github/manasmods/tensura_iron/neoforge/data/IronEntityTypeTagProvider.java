package io.github.manasmods.tensura_iron.neoforge.data;

import io.github.manasmods.tensura.data.TensuraEntityTags;
import io.github.manasmods.tensura.registry.entity.HumanEntityTypes;
import io.github.manasmods.tensura.registry.entity.MonsterEntityTypes;
import io.github.manasmods.tensura_iron.TensuraIron;
import io.github.manasmods.tensura_iron.data.IronEntityTags;
import io.redspace.ironsspellbooks.registries.EntityRegistry;
import io.redspace.ironsspellbooks.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class IronEntityTypeTagProvider extends EntityTypeTagsProvider {

	public IronEntityTypeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture,
                                     @Nullable ExistingFileHelper existingFileHelper) {
		super(output, completableFuture, TensuraIron.MOD_ID, existingFileHelper);
	}

	protected void addTags(@NotNull HolderLookup.Provider provider) {
        tag(TensuraEntityTags.HUMAN_LIKE).add(EntityRegistry.ARCHEVOKER.get(), EntityRegistry.CRYOMANCER.get(),
                EntityRegistry.MAGEHUNTER_VINDICATOR.get(), EntityRegistry.PRIEST.get(), EntityRegistry.PYROMANCER.get());
        tag(TensuraEntityTags.DROP_CRYSTAL).add(EntityRegistry.CATACOMBS_ZOMBIE.get(), EntityRegistry.KEEPER.get(),
                EntityRegistry.DEAD_KING.get(), EntityRegistry.FIRE_BOSS.get(), EntityRegistry.CULTIST.get(), EntityRegistry.NECROMANCER.get(),
                EntityRegistry.SUMMONED_SKELETON.get(), EntityRegistry.SUMMONED_VEX.get(), EntityRegistry.SUMMONED_ZOMBIE.get());

        tag(TensuraEntityTags.HERO_BOSS).add(EntityRegistry.DEAD_KING.get(), EntityRegistry.FIRE_BOSS.get());
        tag(TensuraEntityTags.FULL_GRAVITY_CONTROL).add(EntityRegistry.DEAD_KING.get(), EntityRegistry.FIRE_BOSS.get());
        tag(TensuraEntityTags.NO_FEAR).add(EntityRegistry.DEAD_KING.get(), EntityRegistry.FIRE_BOSS.get(), EntityRegistry.KEEPER.get());
        tag(TensuraEntityTags.NO_POSSESSION).add(EntityRegistry.DEAD_KING.get(), EntityRegistry.FIRE_BOSS.get());
        tag(TensuraEntityTags.NO_MIND_CONTROL).add(EntityRegistry.DEAD_KING.get(), EntityRegistry.FIRE_BOSS.get());
        tag(TensuraEntityTags.NO_CHARISMA).add(EntityRegistry.DEAD_KING.get(), EntityRegistry.FIRE_BOSS.get(),
                EntityRegistry.KEEPER.get(), EntityRegistry.NECROMANCER.get(), EntityRegistry.CULTIST.get());

        tag(TensuraEntityTags.CAN_DIE_IN_LABYRINTH).add(EntityRegistry.SUMMONED_SKELETON.get(),
                EntityRegistry.SUMMONED_VEX.get(), EntityRegistry.SUMMONED_ZOMBIE.get(), EntityRegistry.SUMMONED_POLAR_BEAR.get());
        tag(TensuraEntityTags.SPIRITUAL).add(EntityRegistry.SUMMONED_VEX.get(), EntityRegistry.DEAD_KING.get(), EntityRegistry.FIRE_BOSS.get());

        tag(TensuraEntityTags.HOT_SOURCE).add(EntityRegistry.FIRE_BOSS.get());
        tag(TensuraEntityTags.COLD_SOURCE).add(EntityRegistry.CRYOMANCER.get(), EntityRegistry.ICE_SPIDER.get());
        tag(TensuraEntityTags.CAN_EVAPORATE).add(EntityRegistry.ICE_BLOCK_PROJECTILE.get());
        tag(TensuraEntityTags.CAN_DISTINGUISH).add(EntityRegistry.FIREBOLT_PROJECTILE.get(), EntityRegistry.FIRE_BOMB.get());

        tag(IronEntityTags.IMMUNE_TO_SPELL_BOOST).add(EntityRegistry.DEAD_KING.get(), EntityRegistry.FIRE_BOSS.get(),
                EntityRegistry.KEEPER.get(), EntityRegistry.CURSED_ARMOR_STAND.get());
        tag(ModTags.CANT_USE_PORTAL).add(MonsterEntityTypes.CHARYBDIS.get(), MonsterEntityTypes.AKASH.get(),
                MonsterEntityTypes.IFRIT.get(), MonsterEntityTypes.SYLPHIDE.get(), MonsterEntityTypes.UNDINE.get(), MonsterEntityTypes.WAR_GNOME.get(),
                MonsterEntityTypes.ORC_LORD.get(), MonsterEntityTypes.ORC_DISASTER.get(), 
                HumanEntityTypes.HINATA_SAKAGUCHI.get(), HumanEntityTypes.GAZEL_DWARGO.get(), HumanEntityTypes.TRAINING_DUMMY.get());
	}
}