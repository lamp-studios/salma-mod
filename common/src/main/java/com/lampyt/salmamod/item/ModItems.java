package com.lampyt.salmamod.item;

import com.lampyt.salmamod.block.ModBlocks;
import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.item.DeferredItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import com.lampyt.salmamod.SalmaMod;

import static com.lampyt.salmamod.SalmaMod.id;

public class ModItems {
    public static DeferredItem salmaHead;

    public static void initialize(BalmItemRegistrar items) {
        salmaHead = items.register("salma_head", Item::new).asDeferredItem();
    }

    public static void initialize(BalmCreativeModeTabRegistrar creativeModeTabs) {
        creativeModeTabs.register(SalmaMod.MOD_ID, builder ->
                builder.title(Component.translatable(id(SalmaMod.MOD_ID).toLanguageKey("itemGroup")))
                        .icon(() -> ModItems.salmaHead.createStack())
                        .displayItems((displayParameters, output) -> {
                            output.accept(ModItems.salmaHead);
                            output.accept(ModBlocks.SalmaBlock);
                        })
        );
    }

}
