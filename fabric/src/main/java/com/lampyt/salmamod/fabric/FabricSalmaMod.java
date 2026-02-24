package com.lampyt.salmamod.fabric;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.fabric.platform.runtime.FabricLoadContext;
import net.fabricmc.api.ModInitializer;
import com.lampyt.salmamod.SalmaMod;

public class FabricSalmaMod implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(SalmaMod.MOD_ID, FabricLoadContext.INSTANCE, SalmaMod::initialize);
    }
}
