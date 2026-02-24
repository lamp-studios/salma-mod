package com.lampyt.salmamod.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import com.lampyt.salmamod.item.ModItems;
import com.lampyt.salmamod.tag.ModItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookup) {
        // Add items to custom tags:
        // valueLookupBuilder(ModItemTags.EXAMPLE_TAG)
        //         .add(ModItems.exampleItem.asItem());
    }
}
