package com.madness.entity.client;

import com.madness.Madness;
import com.madness.entity.custom.*;

import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.*;
import net.minecraft.util.Identifier;

public class MadmanRenderer extends MobEntityRenderer<MadmanEntity, MadmanModel> {
    private static final Identifier TEXTURE = Identifier.of(Madness.MOD_ID, "textures/entity/mad_man.png");

    public MadmanRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MadmanModel(ctx.getPart(MadmanModel.MADMAN)), 0.5f);
    }

    @Override
    public boolean shouldRender(
        MadmanEntity entity,
        Frustum frustum,
        double x,
        double y,
        double z
    ) {
        return true;
    }

	@Override
	public Identifier getTexture(MadmanEntity entity) {
	    return TEXTURE;
	}
}
