package io.github.manasmods.tensura_iron.neoforge;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;

public class IronConfig extends ManasConfig {
    @Comment("The multiplier for how much Mana costed to cast spells would be converted to Magicule cost in Tensura.")
    public float manaConversionMultiplier = 50F;
    @Comment("The multiplier for how much spell damage would be boosted to fit with Tensura:Reincarnated.")
    public float spellDamageMultiplier = 10F;

    public String getFileName() {
        return "tensura/iron_spell_config";
    }
}
