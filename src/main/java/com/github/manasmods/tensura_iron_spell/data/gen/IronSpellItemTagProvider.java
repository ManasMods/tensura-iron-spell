package com.github.manasmods.tensura_iron_spell.data.gen;

import com.github.manasmods.manascore.api.data.gen.BlockTagProvider;
import com.github.manasmods.manascore.api.data.gen.ItemTagProvider;
import com.github.manasmods.tensura.data.TensuraTags;
import com.github.manasmods.tensura_iron_spell.TensuraIronSpell;
import io.redspace.ironsspellbooks.registries.ItemRegistry;
import net.minecraftforge.data.event.GatherDataEvent;

public class IronSpellItemTagProvider extends ItemTagProvider {
    public IronSpellItemTagProvider(GatherDataEvent gatherDataEvent, BlockTagProvider blockTagProvider) {
        super(gatherDataEvent, TensuraIronSpell.MOD_ID, blockTagProvider);
    }

    protected void generate() {
        tag(TensuraTags.Items.DUBIOUS_CRYSTAL_INGREDIENT).add(ItemRegistry.ICE_CRYSTAL.get(),
                ItemRegistry.ARCANE_INGOT.get(), ItemRegistry.DIVINE_PEARL.get());
        tag(TensuraTags.Items.DUBIOUS_EFFECT_INGREDIENT).add(ItemRegistry.GREATER_HEALING_POTION.get(),
                ItemRegistry.INVISIBILITY_ELIXIR.get(), ItemRegistry.GREATER_INVISIBILITY_ELIXIR.get(),
                ItemRegistry.EVASION_ELIXIR.get(), ItemRegistry.GREATER_EVASION_ELIXIR.get(),
                ItemRegistry.OAKSKIN_ELIXIR.get(), ItemRegistry.GREATER_OAKSKIN_ELIXIR.get(),
                ItemRegistry.FIRE_ALE.get(), ItemRegistry.NETHERWARD_TINCTURE.get());
        tag(TensuraTags.Items.DUBIOUS_MAGIC_INGREDIENT).add(ItemRegistry.BLOOD_UPGRADE_ORB.get(),
                ItemRegistry.COOLDOWN_UPGRADE_ORB.get(), ItemRegistry.ENDER_UPGRADE_ORB.get(),
                ItemRegistry.EVOCATION_UPGRADE_ORB.get(), ItemRegistry.FIRE_UPGRADE_ORB.get(),
                ItemRegistry.HOLY_UPGRADE_ORB.get(), ItemRegistry.ICE_UPGRADE_ORB.get(),
                ItemRegistry.LIGHTNING_UPGRADE_ORB.get(), ItemRegistry.MANA_UPGRADE_ORB.get(),
                ItemRegistry.NATURE_UPGRADE_ORB.get(), ItemRegistry.PROTECTION_UPGRADE_ORB.get(),
                ItemRegistry.UPGRADE_ORB.get(), ItemRegistry.SHRIVING_STONE.get(),
                ItemRegistry.ENERGIZED_CORE.get());
        tag(TensuraTags.Items.DUBIOUS_RAW_INGREDIENT).add(ItemRegistry.DRAGONSKIN.get(),
                ItemRegistry.HOGSKIN.get(), ItemRegistry.BLOOD_VIAL.get());
    }
}
