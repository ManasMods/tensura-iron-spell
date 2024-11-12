package com.github.manasmods.tensura_iron_spell.data.gen;

import com.github.manasmods.manascore.api.data.gen.BlockTagProvider;
import com.github.manasmods.tensura.data.TensuraTags;
import com.github.manasmods.tensura_iron_spell.TensuraIronSpell;
import io.redspace.ironsspellbooks.registries.BlockRegistry;
import net.minecraftforge.data.event.GatherDataEvent;

public class IronSpellBlockTagProvider extends BlockTagProvider {
    public IronSpellBlockTagProvider(GatherDataEvent gatherDataEvent) {
        super(gatherDataEvent, TensuraIronSpell.MOD_ID);
    }

    protected void generate() {
        tag(TensuraTags.Blocks.SKILL_UNOBTAINABLE).add(BlockRegistry.ARMOR_PILE_BLOCK.get());
    }
}
