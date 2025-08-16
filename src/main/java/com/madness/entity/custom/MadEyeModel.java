package com.madness.entity.custom;

import com.madness.Madness;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MadEyeModel extends SinglePartEntityModel<MadEyeEntity> {

    public static final EntityModelLayer MADEYE = new EntityModelLayer(
        Identifier.of(Madness.MOD_ID, "mad_eye"),
        "main"
    );
    private final ModelPart bb_main;

    public MadEyeModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bb_main = modelPartData.addChild(
            "bb_main",
            ModelPartBuilder.create()
                .uv(13, 5)
                .cuboid(
                    -1.0F,
                    -6.0F,
                    -1.0F,
                    2.0F,
                    2.0F,
                    2.0F,
                    new Dilation(0.0F)
                )
                .uv(13, 12)
                .cuboid(
                    -1.0F,
                    -9.0F,
                    -1.0F,
                    2.0F,
                    2.0F,
                    2.0F,
                    new Dilation(0.0F)
                )
                .uv(13, 5)
                .cuboid(
                    -1.0F,
                    -12.0F,
                    -1.0F,
                    2.0F,
                    2.0F,
                    2.0F,
                    new Dilation(0.0F)
                ),
            ModelTransform.pivot(0.0F, 24.0F, 0.0F)
        );
        return TexturedModelData.of(modelData, 32, 32);
    }

    @Override
    public void setAngles(
        MadEyeEntity entity,
        float limbSwing,
        float limbSwingAmount,
        float ageInTicks,
        float netHeadYaw,
        float headPitch
    ) {}

    @Override
    public void render(
        MatrixStack matrices,
        VertexConsumer vertexConsumer,
        int light,
        int overlay,
        int color
    ) {
        bb_main.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return bb_main;
    }
}
