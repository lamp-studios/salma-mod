package com.lampyt.salmamod.neoforge.client;

import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.neoforge.platform.runtime.NeoForgeLoadContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import com.lampyt.salmamod.SalmaMod;
import com.lampyt.salmamod.client.SalmaModClient;

@Mod(value = SalmaMod.MOD_ID, dist = Dist.CLIENT)
public class NeoForgeSalmaModClient {

    public NeoForgeSalmaModClient(IEventBus modEventBus) {
        final var context = new NeoForgeLoadContext(modEventBus);
        BalmClient.initializeMod(SalmaMod.MOD_ID, context, SalmaModClient::initialize);
    }
}
