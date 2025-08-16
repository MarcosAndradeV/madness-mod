package com.madness.entity.client;

import com.madness.Madness;
import com.madness.entity.custom.*;

import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.*;
import net.minecraft.util.Identifier;

public class MadEyeRenderer extends MobEntityRenderer<MadEyeEntity, MadEyeModel> {
    private static final Identifier TEXTURE = Identifier.of(Madness.MOD_ID, "textures/entity/mad_eye.png");

    public MadEyeRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MadEyeModel(ctx.getPart(MadEyeModel.MADEYE)), 0.5f);
    }

    @Override
    public boolean shouldRender(
        MadEyeEntity entity,
        Frustum frustum,
        double x,
        double y,
        double z
    ) {
        return true;
    }

	@Override
	public Identifier getTexture(MadEyeEntity entity) {
	    return TEXTURE;
	}
}
