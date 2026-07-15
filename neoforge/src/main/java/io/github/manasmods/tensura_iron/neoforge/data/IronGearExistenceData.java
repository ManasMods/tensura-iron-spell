package io.github.manasmods.tensura_iron.neoforge.data;

import io.github.manasmods.tensura.data.existence.gear.GearExistenceData;
import io.github.manasmods.tensura.data.existence.gear.UniqueGearEvolutionHelper;
import io.github.manasmods.tensura.registry.data.TensuraCustomData;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.hazen.hazennstuff.Registries.HnSItemRegistry;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;

public class IronGearExistenceData {
    public static void bootstrap(BootstrapContext<GearExistenceData> context) {
        // Unique Weapon
        register(context, GearExistenceData.getDefault(ItemRegistry.MAGEHUNTER.getId(), 6000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.SPELLBREAKER.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.KEEPER_FLAMBERGE.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.LEGIONNAIRE_FLAMBERGE.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.AMETHYST_RAPIER.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.MISERY.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));

        register(context, GearExistenceData.getDefault(ItemRegistry.AUTOLOADER_CROSSBOW.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.HITHER_THITHER_WAND.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.HELLRAZOR.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.DECREPIT_SCYTHE.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ICE_GREATSWORD.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.TWILIGHT_GALE.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));

        register(context, GearExistenceData.getDefault(ItemRegistry.GRAYBEARD_STAFF.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PYRIUM_STAFF.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ARTIFICER_STAFF.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ICE_STAFF.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.LIGHTNING_ROD_STAFF.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.BLOOD_STAFF.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));

        register(context, GearExistenceData.getDefault(ItemRegistry.WIMPY_SPELL_BOOK.getId(), 2000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.LEGENDARY_SPELL_BOOK.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.NETHERITE_SPELL_BOOK.getId(), 10000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.DIAMOND_SPELL_BOOK.getId(), 8000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.GOLD_SPELL_BOOK.getId(), 7000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.IRON_SPELL_BOOK.getId(), 6000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.COPPER_SPELL_BOOK.getId(), 5000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ROTTEN_SPELL_BOOK.getId(), 5000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.BLAZE_SPELL_BOOK.getId(), 6000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.DRAGONSKIN_SPELL_BOOK.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.DRUIDIC_SPELL_BOOK.getId(), 10000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.VILLAGER_SPELL_BOOK.getId(), 7000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ICE_SPELL_BOOK.getId(), 10000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));

        register(context, GearExistenceData.getDefault(ItemRegistry.EVOKER_SPELL_BOOK.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.NECRONOMICON.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));
        register(context, GearExistenceData.getDefault(ItemRegistry.CURSED_DOLL_SPELLBOOK.getId(), 15000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelWeapons()));

        // Archevoker Set
        register(context, GearExistenceData.getDefault(ItemRegistry.ARCHEVOKER_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ARCHEVOKER_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ARCHEVOKER_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ARCHEVOKER_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Cryomancer Set
        register(context, GearExistenceData.getDefault(ItemRegistry.CRYOMANCER_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.CRYOMANCER_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.CRYOMANCER_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.CRYOMANCER_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Cultist Set
        register(context, GearExistenceData.getDefault(ItemRegistry.CULTIST_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.CULTIST_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.CULTIST_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.CULTIST_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Electromancer Set
        register(context, GearExistenceData.getDefault(ItemRegistry.ELECTROMANCER_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ELECTROMANCER_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ELECTROMANCER_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.ELECTROMANCER_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Netherite Mage Set
        register(context, GearExistenceData.getDefault(ItemRegistry.NETHERITE_MAGE_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.NETHERITE_MAGE_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.NETHERITE_MAGE_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.NETHERITE_MAGE_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Plagued Set
        register(context, GearExistenceData.getDefault(ItemRegistry.PLAGUED_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PLAGUED_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PLAGUED_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PLAGUED_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Priest Set
        register(context, GearExistenceData.getDefault(ItemRegistry.PRIEST_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PRIEST_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PRIEST_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PRIEST_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Pumpkin Set
        register(context, GearExistenceData.getDefault(ItemRegistry.PUMPKIN_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PUMPKIN_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PUMPKIN_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PUMPKIN_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Pyromancer Set
        register(context, GearExistenceData.getDefault(ItemRegistry.PYROMANCER_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PYROMANCER_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PYROMANCER_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.PYROMANCER_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Shadowwalker Set
        register(context, GearExistenceData.getDefault(ItemRegistry.SHADOWWALKER_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.SHADOWWALKER_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.SHADOWWALKER_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.SHADOWWALKER_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Wandering Magician Set
        register(context, GearExistenceData.getDefault(ItemRegistry.WANDERING_MAGICIAN_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.WANDERING_MAGICIAN_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.WANDERING_MAGICIAN_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.WANDERING_MAGICIAN_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        // Wandering Magician Set
        register(context, GearExistenceData.getDefault(ItemRegistry.WIZARD_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.WIZARD_HAT.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.WIZARD_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.WIZARD_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.WIZARD_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));

        register(context, GearExistenceData.getDefault(ItemRegistry.PALADIN_CHESTPLATE.getId(), 15000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.BOOTS_OF_SPEED.getId(), 15000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.INFERNAL_SORCERER_CHESTPLATE.getId(), 20000, 0.03, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(ItemRegistry.TARNISHED_CROWN.getId(), 20000, 0.03, UniqueGearEvolutionHelper.getHighMagisteelArmors()));
        
        // Herta Puppet Set
        register(context, GearExistenceData.getDefault(HnSItemRegistry.HERTA_PUPPET_HELMET.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(HnSItemRegistry.HERTA_PUPPET_CHESTPLATE.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(HnSItemRegistry.HERTA_PUPPET_LEGGINGS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
        register(context, GearExistenceData.getDefault(HnSItemRegistry.HERTA_PUPPET_BOOTS.getId(), 5000, 0.02, UniqueGearEvolutionHelper.getLowMagisteelArmors()));
    }

    public static void register(BootstrapContext<GearExistenceData> context, GearExistenceData data) {
        ResourceKey<GearExistenceData> key = ResourceKey.create(TensuraCustomData.GEAR_EXISTENCE, data.gear());
        context.register(key, data);
    }
}
