package io.github.manasmods.tensura_iron.neoforge.data;

import io.github.manasmods.tensura.data.TensuraItemTags;
import io.github.manasmods.tensura_iron.TensuraIron;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class IronItemTagProvider extends ItemTagsProvider {

	public IronItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> provider, ExistingFileHelper helper) {
		super(output, future, provider, TensuraIron.MOD_ID, helper);
	}

	protected void addTags(HolderLookup.Provider arg) {
        tag(TensuraItemTags.DUBIOUS_CRYSTAL_INGREDIENT).add(ItemRegistry.ICE_CRYSTAL.get(),
                ItemRegistry.ARCANE_INGOT.get(), ItemRegistry.DIVINE_PEARL.get());
        tag(TensuraItemTags.DUBIOUS_EFFECT_INGREDIENT).add(ItemRegistry.GREATER_HEALING_POTION.get(),
                ItemRegistry.INVISIBILITY_ELIXIR.get(), ItemRegistry.GREATER_INVISIBILITY_ELIXIR.get(),
                ItemRegistry.EVASION_ELIXIR.get(), ItemRegistry.GREATER_EVASION_ELIXIR.get(),
                ItemRegistry.OAKSKIN_ELIXIR.get(), ItemRegistry.GREATER_OAKSKIN_ELIXIR.get(),
                ItemRegistry.FIRE_ALE.get(), ItemRegistry.NETHERWARD_TINCTURE.get());
        tag(TensuraItemTags.DUBIOUS_MAGIC_INGREDIENT).add(ItemRegistry.BLOOD_UPGRADE_ORB.get(),
                ItemRegistry.COOLDOWN_UPGRADE_ORB.get(), ItemRegistry.ENDER_UPGRADE_ORB.get(),
                ItemRegistry.EVOCATION_UPGRADE_ORB.get(), ItemRegistry.FIRE_UPGRADE_ORB.get(),
                ItemRegistry.HOLY_UPGRADE_ORB.get(), ItemRegistry.ICE_UPGRADE_ORB.get(),
                ItemRegistry.LIGHTNING_UPGRADE_ORB.get(), ItemRegistry.MANA_UPGRADE_ORB.get(),
                ItemRegistry.NATURE_UPGRADE_ORB.get(), ItemRegistry.PROTECTION_UPGRADE_ORB.get(),
                ItemRegistry.UPGRADE_ORB.get(), ItemRegistry.SHRIVING_STONE.get(),
                ItemRegistry.ENERGIZED_CORE.get());
        tag(TensuraItemTags.DUBIOUS_RAW_INGREDIENT).add(ItemRegistry.DRAGONSKIN.get(),
                ItemRegistry.HOGSKIN.get(), ItemRegistry.BLOOD_VIAL.get());

        tag(TensuraItemTags.NO_DECRAFT).add(ItemRegistry.BLANK_RUNE.get(), ItemRegistry.BLOOD_RUNE.get(),
                ItemRegistry.FIRE_RUNE.get(), ItemRegistry.ICE_RUNE.get(), ItemRegistry.LIGHTNING_RUNE.get(),
                ItemRegistry.ENDER_RUNE.get(), ItemRegistry.HOLY_RUNE.get(), ItemRegistry.EVOCATION_RUNE.get(),
                ItemRegistry.MANA_RUNE.get(), ItemRegistry.COOLDOWN_RUNE.get(), ItemRegistry.PROTECTION_RUNE.get(),
                ItemRegistry.NATURE_RUNE.get());
	}
}
