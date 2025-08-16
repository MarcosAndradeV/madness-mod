package com.madness.item;

import com.madness.Madness;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.*;
import net.minecraft.util.*;

public class ModItems {
    public static final Item MAD_CORE = registerItem("mad_core", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Madness.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Madness.LOGGER.info("Registering Mod Items for " + Madness.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(MAD_CORE);
        });
    }
}
