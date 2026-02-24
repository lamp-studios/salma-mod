package com.lampyt.salmamod.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import com.lampyt.salmamod.block.ModBlocks;
import com.lampyt.salmamod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider>
            registries) {
        super(output, "en_us", registries);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider lookup, TranslationBuilder builder) {
        // Items
        builder.add(ModItems.salmaHead.asItem(), "Salma Head");
        builder.add(ModBlocks.SalmaBlock.asItem(), "Salma Block");

        // Blocks
        builder.add(ModBlocks.SalmaBlock.asBlock(), "Salma Block");

        // Creative tab
        builder.add("itemGroup.salmamod.salmamod", "Salma Mod");
    }
}