package com.lampyt.salmamod.fabric.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.*;
import com.lampyt.salmamod.block.ModBlocks;
import com.lampyt.salmamod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        // Simple cube block (all sides same texture):
        generator.createTrivialCube(ModBlocks.SalmaBlock.asBlock());

        // Block with item model from block model:
        // generator.createGenericCube(ModBlocks.exampleBlock.asBlock());
        // generator.registerSimpleItemModel(ModBlocks.exampleBlock.asBlock(), ModelLocationUtils.getModelLocation(ModBlocks.exampleBlock.asItem()));
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(ModItems.salmaHead.asItem(), ModelTemplates.FLAT_ITEM);
    }

}
