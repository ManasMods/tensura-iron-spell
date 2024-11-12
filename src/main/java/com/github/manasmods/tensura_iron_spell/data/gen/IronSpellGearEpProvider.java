package com.github.manasmods.tensura_iron_spell.data.gen;

import com.github.manasmods.manascore.api.data.gen.CustomDataProvider;
import com.github.manasmods.tensura.data.pack.GearEPCount;
import com.google.gson.JsonElement;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class IronSpellGearEpProvider extends CustomDataProvider {
    public IronSpellGearEpProvider(GatherDataEvent event) {
        super("gear/ep", event.getGenerator());
    }

    public @NotNull String getName() {
        return "Iron Spell Gear EP";
    }

    protected void run(BiConsumer<ResourceLocation, Supplier<JsonElement>> biConsumer) {
        GearEPCount.of(ItemRegistry.TARNISHED_CROWN.getId(), 20000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.BLOOD_STAFF.getId(), 20000, 1000000, 0.03).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.HITHER_THITHER_WAND.getId(), 210000, 1000000, 0.03).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.GRAYBEARD_STAFF.getId(), 1000, 1000000, 0.01).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.ARTIFICER_STAFF.getId(), 3000, 1000000, 0.015).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.ICE_STAFF.getId(), 5000, 1000000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.LIGHTNING_ROD_STAFF.getId(), 5000, 1000000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.MAGEHUNTER.getId(), 6000, 250000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.SPELLBREAKER.getId(), 15000, 250000, 0.03).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.KEEPER_FLAMBERGE.getId(), 15000, 250000, 0.03).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.AMETHYST_RAPIER.getId(), 15000, 250000, 0.03).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.ARCHEVOKER_HELMET.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.ARCHEVOKER_CHESTPLATE.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.ARCHEVOKER_LEGGINGS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.ARCHEVOKER_BOOTS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.CRYOMANCER_HELMET.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.CRYOMANCER_CHESTPLATE.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.CRYOMANCER_LEGGINGS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.CRYOMANCER_BOOTS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.CULTIST_HELMET.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.CULTIST_CHESTPLATE.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.CULTIST_LEGGINGS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.CULTIST_BOOTS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.ELECTROMANCER_HELMET.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.ELECTROMANCER_CHESTPLATE.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.ELECTROMANCER_LEGGINGS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.ELECTROMANCER_BOOTS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.NETHERITE_MAGE_HELMET.getId(), 10000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.NETHERITE_MAGE_CHESTPLATE.getId(), 10000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.NETHERITE_MAGE_LEGGINGS.getId(), 10000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.NETHERITE_MAGE_BOOTS.getId(), 10000, 800000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.PLAGUED_HELMET.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PLAGUED_CHESTPLATE.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PLAGUED_LEGGINGS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PLAGUED_BOOTS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.PRIEST_HELMET.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PRIEST_CHESTPLATE.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PRIEST_LEGGINGS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PRIEST_BOOTS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.PUMPKIN_HELMET.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PUMPKIN_CHESTPLATE.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PUMPKIN_LEGGINGS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PUMPKIN_BOOTS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.PYROMANCER_HELMET.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PYROMANCER_CHESTPLATE.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PYROMANCER_LEGGINGS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.PYROMANCER_BOOTS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.SHADOWWALKER_HELMET.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.SHADOWWALKER_CHESTPLATE.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.SHADOWWALKER_LEGGINGS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.SHADOWWALKER_BOOTS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);

        GearEPCount.of(ItemRegistry.WANDERING_MAGICIAN_HELMET.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.WANDERING_MAGICIAN_CHESTPLATE.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.WANDERING_MAGICIAN_LEGGINGS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
        GearEPCount.of(ItemRegistry.WANDERING_MAGICIAN_BOOTS.getId(), 5000, 800000, 0.02).buildJson(biConsumer);
    }
}
