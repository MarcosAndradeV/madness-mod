package com.madness.entity.custom;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

import com.madness.Madness;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MadmanModel extends EntityModel<MadmanEntity> {

    public static final EntityModelLayer MADMAN = new EntityModelLayer(
        Identifier.of(Madness.MOD_ID, "mad_man"),
        "main"
    );
    private ModelPart orc_boss;
    private ModelPart orc_boss2;
    private ModelPart bb_main;

    public MadmanModel(ModelPart root) {
        this.orc_boss = root.getChild("orc_boss");
        this.orc_boss2 = root.getChild("orc_boss2");
        this.bb_main = root.getChild("bb_main");
    }

    public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData orc_boss = modelPartData.addChild("orc_boss", ModelPartBuilder.create().uv(0, 52).cuboid(-12.0F, -68.0F, -12.0F, 24.0F, 24.0F, 24.0F, new Dilation(0.0F))
		.uv(64, 100).cuboid(8.0F, -76.0F, -4.0F, 8.0F, 12.0F, 8.0F, new Dilation(0.0F))
		.uv(160, 32).cuboid(-16.0F, -76.0F, -4.0F, 8.0F, 12.0F, 8.0F, new Dilation(0.0F))
		.uv(96, 152).cuboid(-8.0F, -48.0F, -16.0F, 16.0F, 12.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-16.0F, -44.0F, -8.0F, 32.0F, 32.0F, 20.0F, new Dilation(0.0F))
		.uv(96, 52).cuboid(16.0F, -52.0F, -12.0F, 12.0F, 16.0F, 24.0F, new Dilation(0.0F))
		.uv(64, 120).cuboid(20.0F, -60.0F, -4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(80, 120).cuboid(20.0F, -60.0F, 4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(96, 92).cuboid(-28.0F, -52.0F, -12.0F, 12.0F, 16.0F, 24.0F, new Dilation(0.0F))
		.uv(168, 0).cuboid(-24.0F, -60.0F, -4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(168, 12).cuboid(-24.0F, -60.0F, 4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 132).cuboid(16.0F, -36.0F, -6.0F, 12.0F, 24.0F, 12.0F, new Dilation(0.0F))
		.uv(48, 132).cuboid(-28.0F, -36.0F, -6.0F, 12.0F, 24.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 168).cuboid(32.0F, -48.0F, -2.0F, 4.0F, 32.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 100).cuboid(32.0F, -56.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(16, 168).cuboid(-36.0F, -48.0F, -2.0F, 4.0F, 32.0F, 4.0F, new Dilation(0.0F))
		.uv(104, 0).cuboid(-48.0F, -56.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(152, 132).cuboid(4.0F, -12.0F, -6.0F, 8.0F, 12.0F, 12.0F, new Dilation(0.0F))
		.uv(144, 156).cuboid(-12.0F, -12.0F, -6.0F, 8.0F, 12.0F, 12.0F, new Dilation(0.0F))
		.uv(104, 32).cuboid(2.0F, 0.0F, -12.0F, 12.0F, 4.0F, 16.0F, new Dilation(0.0F))
		.uv(96, 132).cuboid(-14.0F, 0.0F, -12.0F, 12.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData orc_boss2 = modelPartData.addChild("orc_boss2", ModelPartBuilder.create().uv(0, 52).cuboid(-12.0F, -68.0F, -12.0F, 24.0F, 24.0F, 24.0F, new Dilation(0.0F))
		.uv(64, 100).cuboid(8.0F, -76.0F, -4.0F, 8.0F, 12.0F, 8.0F, new Dilation(0.0F))
		.uv(160, 32).cuboid(-16.0F, -76.0F, -4.0F, 8.0F, 12.0F, 8.0F, new Dilation(0.0F))
		.uv(96, 152).cuboid(-8.0F, -48.0F, -16.0F, 16.0F, 12.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-16.0F, -44.0F, -8.0F, 32.0F, 32.0F, 20.0F, new Dilation(0.0F))
		.uv(96, 52).cuboid(16.0F, -52.0F, -12.0F, 12.0F, 16.0F, 24.0F, new Dilation(0.0F))
		.uv(64, 120).cuboid(20.0F, -60.0F, -4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(80, 120).cuboid(20.0F, -60.0F, 4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(96, 92).cuboid(-28.0F, -52.0F, -12.0F, 12.0F, 16.0F, 24.0F, new Dilation(0.0F))
		.uv(168, 0).cuboid(-24.0F, -60.0F, -4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(168, 12).cuboid(-24.0F, -60.0F, 4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 132).cuboid(16.0F, -36.0F, -6.0F, 12.0F, 24.0F, 12.0F, new Dilation(0.0F))
		.uv(48, 132).cuboid(-28.0F, -36.0F, -6.0F, 12.0F, 24.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 168).cuboid(32.0F, -48.0F, -2.0F, 4.0F, 32.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 100).cuboid(32.0F, -56.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(16, 168).cuboid(-36.0F, -48.0F, -2.0F, 4.0F, 32.0F, 4.0F, new Dilation(0.0F))
		.uv(104, 0).cuboid(-48.0F, -56.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(152, 132).cuboid(4.0F, -12.0F, -6.0F, 8.0F, 12.0F, 12.0F, new Dilation(0.0F))
		.uv(144, 156).cuboid(-12.0F, -12.0F, -6.0F, 8.0F, 12.0F, 12.0F, new Dilation(0.0F))
		.uv(104, 32).cuboid(2.0F, 0.0F, -12.0F, 12.0F, 4.0F, 16.0F, new Dilation(0.0F))
		.uv(96, 132).cuboid(-14.0F, 0.0F, -12.0F, 12.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 52).cuboid(-12.0F, -68.0F, -12.0F, 24.0F, 24.0F, 24.0F, new Dilation(0.0F))
		.uv(64, 100).cuboid(8.0F, -76.0F, -4.0F, 8.0F, 12.0F, 8.0F, new Dilation(0.0F))
		.uv(160, 32).cuboid(-16.0F, -76.0F, -4.0F, 8.0F, 12.0F, 8.0F, new Dilation(0.0F))
		.uv(96, 152).cuboid(-8.0F, -48.0F, -16.0F, 16.0F, 12.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-16.0F, -44.0F, -8.0F, 32.0F, 32.0F, 20.0F, new Dilation(0.0F))
		.uv(96, 52).cuboid(16.0F, -52.0F, -12.0F, 12.0F, 16.0F, 24.0F, new Dilation(0.0F))
		.uv(64, 120).cuboid(20.0F, -60.0F, -4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(80, 120).cuboid(20.0F, -60.0F, 4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(96, 92).cuboid(-28.0F, -52.0F, -12.0F, 12.0F, 16.0F, 24.0F, new Dilation(0.0F))
		.uv(168, 0).cuboid(-24.0F, -60.0F, -4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(168, 12).cuboid(-24.0F, -60.0F, 4.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 132).cuboid(16.0F, -36.0F, -6.0F, 12.0F, 24.0F, 12.0F, new Dilation(0.0F))
		.uv(48, 132).cuboid(-28.0F, -36.0F, -6.0F, 12.0F, 24.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 168).cuboid(32.0F, -48.0F, -2.0F, 4.0F, 32.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 100).cuboid(32.0F, -56.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(16, 168).cuboid(-36.0F, -48.0F, -2.0F, 4.0F, 32.0F, 4.0F, new Dilation(0.0F))
		.uv(104, 0).cuboid(-48.0F, -56.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(152, 132).cuboid(4.0F, -12.0F, -6.0F, 8.0F, 12.0F, 12.0F, new Dilation(0.0F))
		.uv(144, 156).cuboid(-12.0F, -12.0F, -6.0F, 8.0F, 12.0F, 12.0F, new Dilation(0.0F))
		.uv(104, 32).cuboid(2.0F, 0.0F, -12.0F, 12.0F, 4.0F, 16.0F, new Dilation(0.0F))
		.uv(96, 132).cuboid(-14.0F, 0.0F, -12.0F, 12.0F, 4.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
    @Override
    public void render(
        MatrixStack matrices,
        VertexConsumer vertexConsumer,
        int light,
        int overlay,
        int color
    ) {
        orc_boss.render(matrices, vertexConsumer, light, overlay, color);
        orc_boss.render(matrices, vertexConsumer, light, overlay, color);
        bb_main.render(matrices, vertexConsumer, light, overlay, color);
    }

	@Override
	public void setAngles(MadmanEntity entity, float limbAngle, float limbDistance, float animationProgress,
			float headYaw, float headPitch) {
		super.animateModel(entity, limbAngle, limbDistance, animationProgress);
	}
}
