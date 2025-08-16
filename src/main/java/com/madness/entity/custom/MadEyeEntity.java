package com.madness.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class MadEyeEntity extends PathAwareEntity {
    public MadEyeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    // -------------------------
    // Register default attributes
    // -------------------------
    public static DefaultAttributeContainer.Builder createMadEyeAttributes() {
        return PathAwareEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0)     // 20 health
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25) // walking speed
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32.0);  // can see players at 32 blocks
    }

    // -------------------------
    // Define AI goals
    // -------------------------
    @Override
    protected void initGoals() {
        // Goal priorities: lower number = higher priority
        this.goalSelector.add(0, new SwimGoal(this)); // can swim
        this.goalSelector.add(1, new WanderAroundFarGoal(this, 1.0)); // wander around
        this.goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f)); // look at players
        this.goalSelector.add(3, new LookAroundGoal(this)); // look around randomly
    }
}
