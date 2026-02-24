package com.lampyt.salmamod;

import net.blay09.mods.balm.Balm;
import net.minecraft.resources.Identifier;
import net.blay09.mods.balm.core.BalmRegistrars;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lampyt.salmamod.block.ModBlocks;
import com.lampyt.salmamod.item.ModItems;

public class SalmaMod {

    public static final Logger logger = LoggerFactory.getLogger(SalmaMod.class);

    public static final String MOD_ID = "salmamod";

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    public static SalmaModConfig config() {
        return Balm.config().getActiveConfig(SalmaModConfig.class);
    }

    public static void initialize(BalmRegistrars registrars) {
        Balm.config().registerConfig(SalmaModConfig.class);

        registrars.blocks(ModBlocks::initialize);
        registrars.items(ModItems::initialize);
        registrars.creativeModeTabs(ModItems::initialize);
    }

}
