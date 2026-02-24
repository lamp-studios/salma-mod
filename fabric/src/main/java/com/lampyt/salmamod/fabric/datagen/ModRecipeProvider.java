package com.lampyt.salmamod.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import com.lampyt.salmamod.SalmaMod;
import com.lampyt.salmamod.block.ModBlocks;
import com.lampyt.salmamod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                // Shaped recipe:
                // shaped(RecipeCategory.DECORATIONS, ModBlocks.exampleBlock)
                //         .pattern("DDD")
                //         .pattern("SSS")
                //         .define('D', Items.DIAMOND)
                //         .define('S', Items.STICK)
                //         .unlockedBy("has_diamond", has(Items.DIAMOND))
                //         .save(exporter);

                // Shapeless recipe:
                // shapeless(RecipeCategory.MISC, ModItems.exampleItem)
                //         .requires(Items.DIAMOND)
                //         .requires(Items.BONE_MEAL)
                //         .unlockedBy("has_bone_meal", has(Items.BONE_MEAL))
                //         .save(exporter);

                // Smelting recipe:
                // smeltingResultFromBase(ModItems.exampleIngot, ModBlocks.exampleOre);
            }
        };
    }

    @Override
    public String getName() {
        return SalmaMod.MOD_ID;
    }
}
