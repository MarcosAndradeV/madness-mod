package com.madness.entity;

import com.madness.Madness;
import com.madness.entity.custom.MadEyeEntity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<MadEyeEntity> MADEYE = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Madness.MOD_ID, "mad_eye"),
        EntityType.Builder.<MadEyeEntity>create(MadEyeEntity::new, SpawnGroup.MONSTER).build()
    );

    public static void registerModEntities() {
        Madness.LOGGER.info("Registering Mod Entities for " + Madness.MOD_ID);
    }
}
