package com.madness;

import com.madness.entity.*;
import com.madness.entity.client.*;
import com.madness.entity.custom.*;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class MadnessClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
	    EntityRendererRegistry.register(ModEntities.MADEYE, MadEyeRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(MadEyeModel.MADEYE, MadEyeModel::getTexturedModelData);
		FabricDefaultAttributeRegistry.register(ModEntities.MADEYE, MadEyeEntity.createAttributes());

        EntityRendererRegistry.register(ModEntities.MADMAN, MadmanRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MadmanModel.MADMAN, MadmanModel::getTexturedModelData);
        FabricDefaultAttributeRegistry.register(ModEntities.MADMAN, MadmanEntity.createAttributes());
	}
}
