package com.madness.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.AttackGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class MadmanEntity extends ZombieEntity {

    public MadmanEntity(
        EntityType<? extends ZombieEntity> entityType,
        World world
    ) {
        super(entityType, world);
    }

    // -------------------------
    // Register default attributes
    // -------------------------
    public static DefaultAttributeContainer.Builder createAttributes() {
        return ZombieEntity.createZombieAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 30.0)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 6.0)
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32.0);
    }

    // -------------------------
    // Define AI goals
    // -------------------------
    @Override
    protected void initGoals() {
        super.initGoals();
        // Goal priorities: lower number = higher priority
        this.goalSelector.add(0, new AttackGoal(this)); // can swim
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        return super.damage(source, amount);
    }

    @Override
    public boolean tryAttack(Entity target) {
        var hit = super.tryAttack(target);
        if(hit) {
            target.addVelocity(new Vec3d(0, 10, 0));
        }
        return hit;
    }
}
