package io.github.manasmods.tensura_iron.neoforge.data;

import io.github.manasmods.tensura.registry.data.TensuraCustomData;
import io.github.manasmods.tensura_iron.TensuraIron;
import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class IronRegistryProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(TensuraCustomData.ENTITY_EXISTENCE, IronEntityExistenceData::bootstrap)
            .add(TensuraCustomData.GEAR_EXISTENCE, IronGearExistenceData::bootstrap);

    public IronRegistryProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(TensuraIron.MOD_ID, IronsSpellbooks.MODID));
    }
}
