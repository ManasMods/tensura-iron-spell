package io.github.manasmods.tensura_iron.neoforge;

import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura_iron.neoforge.data.IronBlockTagProvider;
import io.github.manasmods.tensura_iron.neoforge.data.IronEntityTypeTagProvider;
import io.github.manasmods.tensura_iron.neoforge.data.IronItemTagProvider;
import io.github.manasmods.tensura_iron.neoforge.data.IronRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import io.github.manasmods.tensura_iron.TensuraIron;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@Mod(TensuraIron.MOD_ID)
public final class TensuraIronNeoForge {
    public TensuraIronNeoForge(IEventBus bus) {
        TensuraIron.init();
        ConfigRegistry.registerConfig(new IronConfig());
        bus.addListener(this::gatherData);
    }

    public void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        IronBlockTagProvider blockTagsProvider = new IronBlockTagProvider(output, lookupProvider, helper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new IronItemTagProvider(output, lookupProvider, blockTagsProvider.contentsGetter(), helper));
        generator.addProvider(event.includeServer(), new IronEntityTypeTagProvider(output, lookupProvider, helper));

        DatapackBuiltinEntriesProvider registryProvider = new IronRegistryProvider(output, lookupProvider);
        generator.addProvider(event.includeServer(), registryProvider);
    }
}
