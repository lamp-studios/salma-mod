package com.lampyt.salmamod.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import com.lampyt.salmamod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> provider) {
        super(dataOutput, provider);
    }

    @Override
    public void generate() {
        // Block drops itself:
        dropSelf(ModBlocks.SalmaBlock.asBlock());

        // Silk touch only:
        // add(ModBlocks.exampleBlock.asBlock(), createSilkTouchOnlyTable(ModBlocks.exampleBlock.asBlock()));

        // Ore drops (fortune-compatible):
        // add(ModBlocks.exampleOre.asBlock(), createOreDrop(ModBlocks.exampleOre.asBlock(), ModItems.exampleGem.asItem()));
    }
}
