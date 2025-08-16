package com.madness;

import com.madness.entity.ModEntities;
import com.madness.entity.client.MadEyeRenderer;
import com.madness.entity.custom.MadEyeEntity;
import com.madness.entity.custom.MadEyeModel;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class MadnessClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
	    EntityRendererRegistry.register(ModEntities.MADEYE, MadEyeRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(MadEyeModel.MADEYE, MadEyeModel::getTexturedModelData);
		FabricDefaultAttributeRegistry.register(ModEntities.MADEYE, MadEyeEntity.createMadEyeAttributes());
	}
}
