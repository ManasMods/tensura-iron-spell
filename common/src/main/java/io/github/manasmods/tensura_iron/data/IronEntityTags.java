package io.github.manasmods.tensura_iron.data;

import io.github.manasmods.tensura_iron.TensuraIron;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class IronEntityTags {
    public static TagKey<EntityType<?>> IMMUNE_TO_SPELL_BOOST = modTag("immune_to_spell_boost");

    static TagKey<EntityType<?>> modTag(String name) {
        return create(ResourceLocation.fromNamespaceAndPath(TensuraIron.MOD_ID, name));
    }
    static TagKey<EntityType<?>> create(final ResourceLocation name) {
        return TagKey.create(Registries.ENTITY_TYPE, name);
    }
}