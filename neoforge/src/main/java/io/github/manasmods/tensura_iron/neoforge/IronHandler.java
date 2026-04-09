package io.github.manasmods.tensura_iron.neoforge;

import dev.architectury.event.events.common.LootEvent;
import io.github.manasmods.tensura.registry.item.TensuraMaterialItems;
import io.github.manasmods.tensura.registry.item.TensuraMobDropItems;
import io.redspace.ironsspellbooks.registries.EntityRegistry;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;

public class IronHandler {
    public static void init() {
        LootEvent.MODIFY_LOOT_TABLE.register((key, context, builtin) -> {
            if (!builtin) return;
            if (key.equals(EntityRegistry.DEAD_KING.get().getDefaultLootTable()))
                context.addPool(LootPool.lootPool().add(LootItem.lootTableItem(TensuraMobDropItems.DAEMON_ESSENCE.get())));
            else if (key.equals(EntityRegistry.FIRE_BOSS.get().getDefaultLootTable())) {
                context.addPool(LootPool.lootPool().add(LootItem.lootTableItem(TensuraMobDropItems.ELEMENTAL_ESSENCE.get())));
                context.addPool(LootPool.lootPool().add(LootItem.lootTableItem(TensuraMaterialItems.FIRE_ELEMENTAL_SHARD.get())));
            }
        });
    }
}
