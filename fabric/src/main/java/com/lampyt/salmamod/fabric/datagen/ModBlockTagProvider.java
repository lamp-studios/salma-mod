package com.lampyt.salmamod.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import com.lampyt.salmamod.block.ModBlocks;
import com.lampyt.salmamod.tag.ModBlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        // Add blocks to vanilla tags:
        // getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
        //         .add(ModBlocks.exampleBlock.asBlock());

        // Add blocks to custom tags:
        // valueLookupBuilder(ModBlockTags.EXAMPLE_TAG)
        //         .add(ModBlocks.exampleBlock.asBlock());
    }
}
