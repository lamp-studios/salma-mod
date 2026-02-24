package com.lampyt.salmamod.neoforge;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.neoforge.platform.runtime.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import com.lampyt.salmamod.SalmaMod;

@Mod(SalmaMod.MOD_ID)
public class NeoForgeSalmaMod {

    public NeoForgeSalmaMod(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);
        Balm.initializeMod(SalmaMod.MOD_ID, context, SalmaMod::initialize);
    }
}
