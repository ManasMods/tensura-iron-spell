package io.github.manasmods.tensura_iron.neoforge.data;

import io.github.manasmods.tensura.data.existence.EntityExistenceData;
import io.github.manasmods.tensura.registry.data.TensuraCustomData;
import io.github.manasmods.tensura.registry.magic.AspectualMagics;
import io.github.manasmods.tensura.registry.magic.SpiritualMagics;
import io.github.manasmods.tensura.registry.magic.SummoningMagics;
import io.github.manasmods.tensura.registry.skill.CommonSkills;
import io.github.manasmods.tensura.registry.skill.ExtraSkills;
import io.github.manasmods.tensura.registry.skill.IntrinsicSkills;
import io.github.manasmods.tensura.registry.skill.ResistanceSkills;
import io.redspace.ironsspellbooks.registries.EntityRegistry;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class IronEntityExistenceData {
    public static void bootstrap(BootstrapContext<EntityExistenceData> context) {
        // Apothecarist
        List<ResourceLocation> apothecaristList = new ArrayList<>();
        apothecaristList.add(ResistanceSkills.POISON_RESISTANCE.getId());
        apothecaristList.add(AspectualMagics.ACID_SHELL.getId());
        apothecaristList.add(AspectualMagics.PROTECTION.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.APOTHECARIST.getId(), 500, 9000, 10000, 1000, 2000, apothecaristList));

        // Archevoker
        List<ResourceLocation> archevokerList = new ArrayList<>();
        archevokerList.add(ExtraSkills.SAGE.getId());
        archevokerList.add(AspectualMagics.INVISIBLE.getId());
        archevokerList.add(AspectualMagics.MAGIC_WALL.getId());
        archevokerList.add(AspectualMagics.FIRE.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.ARCHEVOKER.getId(), 500, 9000, 10000, 1000, 2000, archevokerList));

        // Catacombs Zombie
        register(context, EntityExistenceData.getDefault(EntityRegistry.CATACOMBS_ZOMBIE.getId(), 100, 1000, 2000, 500, 1000));

        // Keeper
        List<ResourceLocation> keeperList = new ArrayList<>();
        keeperList.add(ExtraSkills.STEEL_STRENGTH.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.KEEPER.getId(), 800, 5000, 10000, 5000, 10000, keeperList));

        // Cryomancer
        List<ResourceLocation> cryoList = new ArrayList<>();
        cryoList.add(ResistanceSkills.COLD_RESISTANCE.getId());
        cryoList.add(AspectualMagics.FREEZE.getId());
        cryoList.add(AspectualMagics.ICICLE_LANCE.getId());
        cryoList.add(AspectualMagics.ICE_WALL.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.CRYOMANCER.getId(), 400, 8000, 12000, 2000, 4000, cryoList));

        // Cultist
        List<ResourceLocation> cultistList = new ArrayList<>();
        cultistList.add(ResistanceSkills.DARKNESS_ATTACK_RESISTANCE.getId());
        cultistList.add(SpiritualMagics.DARKNESS.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.CULTIST.getId(), 500, 10000, 13000, 2000, 2000, cultistList));

        // Dead King
        List<ResourceLocation> deadKingList = new ArrayList<>();
        deadKingList.add(SpiritualMagics.DARKNESS.getId());
        deadKingList.add(SpiritualMagics.TRUE_DARKNESS.getId());
        deadKingList.add(AspectualMagics.ACID_SHELL.getId());
        deadKingList.add(ResistanceSkills.POISON_RESISTANCE.getId());
        deadKingList.add(ResistanceSkills.DARKNESS_ATTACK_RESISTANCE.getId());
        deadKingList.add(ResistanceSkills.ABNORMAL_CONDITION_RESISTANCE.getId());
        deadKingList.add(ResistanceSkills.PHYSICAL_ATTACK_RESISTANCE.getId());
        deadKingList.add(ExtraSkills.MAGIC_SENSE.getId());
        deadKingList.add(ExtraSkills.SAGE.getId());
        deadKingList.add(IntrinsicSkills.BLOOD_MIST.getId());
        deadKingList.add(CommonSkills.SELF_REGENERATION.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.DEAD_KING.getId(), 5000, 80000, 120000, 20000, 40000, deadKingList));

        // Fire Boss
        List<ResourceLocation> fireBossList = new ArrayList<>();
        fireBossList.add(SpiritualMagics.HELLFIRE.getId());
        fireBossList.add(SpiritualMagics.FIRE_BREATH.getId());
        fireBossList.add(AspectualMagics.FIRE.getId());
        fireBossList.add(AspectualMagics.FIRE_LANCE.getId());
        fireBossList.add(AspectualMagics.FIRE_BALL.getId());
        fireBossList.add(AspectualMagics.FIRE_STORM.getId());
        fireBossList.add(ResistanceSkills.FLAME_ATTACK_RESISTANCE.getId());
        fireBossList.add(ResistanceSkills.ABNORMAL_CONDITION_RESISTANCE.getId());
        fireBossList.add(ResistanceSkills.PHYSICAL_ATTACK_RESISTANCE.getId());
        fireBossList.add(ExtraSkills.MAGIC_SENSE.getId());
        fireBossList.add(ExtraSkills.SAGE.getId());
        deadKingList.add(CommonSkills.SELF_REGENERATION.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.FIRE_BOSS.getId(), 5000, 140000, 160000, 20000, 40000, fireBossList));

        // Ice Spider
        List<ResourceLocation> spiderList = new ArrayList<>();
        spiderList.add(ResistanceSkills.COLD_RESISTANCE.getId());
        spiderList.add(AspectualMagics.ICICLE_LANCE.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.ICE_SPIDER.getId(), 200, 5000, 6000, 1000, 2000, spiderList));

        // Magehunter Vindicator
        register(context, EntityExistenceData.getDefault(EntityRegistry.MAGEHUNTER_VINDICATOR.getId(), 300, 1000, 2000, 5000, 6000));

        // Necromancer
        List<ResourceLocation> nercomancerList = new ArrayList<>();
        nercomancerList.add(ResistanceSkills.DARKNESS_ATTACK_RESISTANCE.getId());
        nercomancerList.add(SpiritualMagics.DARKNESS.getId());
        nercomancerList.add(SpiritualMagics.CREATE_LESSER_UNDEAD.getId());
        nercomancerList.add(AspectualMagics.ICICLE_LANCE.getId());
        nercomancerList.add(AspectualMagics.FIRE.getId());
        nercomancerList.add(SummoningMagics.SUMMON_HOUND_DOG.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.NECROMANCER.getId(), 500, 10000, 12000, 10000, 20000, nercomancerList));

        // Priest
        List<ResourceLocation> priestList = new ArrayList<>();
        priestList.add(ResistanceSkills.LIGHT_ATTACK_RESISTANCE.getId());
        priestList.add(SpiritualMagics.LIGHT.getId());
        priestList.add(AspectualMagics.HEALING.getId());
        priestList.add(AspectualMagics.HEALTHCARE.getId());
        priestList.add(AspectualMagics.WIND_GUST.getId());
        priestList.add(AspectualMagics.PROTECTION.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.PRIEST.getId(), 400, 8000, 12000, 2000, 4000, priestList));

        // Pyromancer
        List<ResourceLocation> pyroList = new ArrayList<>();
        pyroList.add(ResistanceSkills.FLAME_ATTACK_RESISTANCE.getId());
        pyroList.add(AspectualMagics.FIRE.getId());
        pyroList.add(AspectualMagics.FIRE_BALL.getId());
        pyroList.add(AspectualMagics.FIRE_STORM.getId());
        register(context, EntityExistenceData.getDefault(EntityRegistry.PYROMANCER.getId(), 400, 8000, 12000, 2000, 4000, pyroList));

        // Summoned Entities
        register(context, EntityExistenceData.getDefault(EntityRegistry.SPECTRAL_STEED.getId(), 10, 100, 200));
        register(context, EntityExistenceData.getDefault(EntityRegistry.SUMMONED_POLAR_BEAR.getId(), 80, 1450, 2000));
        register(context, EntityExistenceData.getDefault(EntityRegistry.SUMMONED_SKELETON.getId(), 100, 2000, 3000));
        register(context, EntityExistenceData.getDefault(EntityRegistry.SUMMONED_VEX.getId(), 100, 1900, 3000));
        register(context, EntityExistenceData.getDefault(EntityRegistry.SUMMONED_ZOMBIE.getId(), 80, 1400, 2500));
    }

    public static void register(BootstrapContext<EntityExistenceData> context, EntityExistenceData data) {
        ResourceKey<EntityExistenceData> key = ResourceKey.create(TensuraCustomData.ENTITY_EXISTENCE, data.entity());
        context.register(key, data);
    }
}