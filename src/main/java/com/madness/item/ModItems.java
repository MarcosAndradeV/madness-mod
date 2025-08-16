package com.madness.item;

import com.madness.Madness;
import com.madness.entity.ModEntities;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.*;
import net.minecraft.util.*;

public class ModItems {
    public static final Item MAD_CORE = registerItem("mad_core", new Item(new Item.Settings()));
    public static final Item MAD_EYE_SPAWN_EGG = Registry.register(
        Registries.ITEM,
        Identifier.of(Madness.MOD_ID, "mad_eye_spawn_egg"),
        new SpawnEggItem(
            ModEntities.MADEYE,
            0x3A2EAD, // primary egg color (purple-ish)
            0x00FF00, // secondary egg spots color (green)
            new Item.Settings()
        )
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Madness.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Madness.LOGGER.info("Registering Mod Items for " + Madness.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(MAD_CORE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
            entries.add(MAD_EYE_SPAWN_EGG);
        });
    }
}
