package io.github.manasmods.tensura_iron.neoforge.data;

import io.github.manasmods.tensura.data.TensuraBlockTags;
import io.github.manasmods.tensura_iron.TensuraIron;
import io.redspace.ironsspellbooks.registries.BlockRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class IronBlockTagProvider extends BlockTagsProvider {

	public IronBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture,
                                @Nullable ExistingFileHelper existingFileHelper) {
		super(output, completableFuture, TensuraIron.MOD_ID, existingFileHelper);
	}

	protected void addTags(HolderLookup.Provider arg) {
        tag(TensuraBlockTags.HEAT_SOURCE_BLOCKS).add(BlockRegistry.BRAZIER_FIRE.get());
		tag(TensuraBlockTags.SKILL_UNBREAKABLE).add(BlockRegistry.PORTAL_FRAME.get(), BlockRegistry.POCKET_PORTAL_FRAME.get());
        tag(TensuraBlockTags.SKILL_UNOBTAINABLE).add(BlockRegistry.ARMOR_PILE_BLOCK.get());
	}
}
