package com.lampyt.salmamod.block;

import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class ModBlocks {
    public static DeferredBlock SalmaBlock;

    public static void initialize(BalmBlockRegistrar blocks) {
        SalmaBlock = blocks.register("salma_block", SalmaBlock::new, it -> it.strength(1.5f).sound(SoundType.WOOL)).withDefaultItem().asDeferredBlock();
    }

}
