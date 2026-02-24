package com.lampyt.salmamod.fabric.client;

import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.fabric.platform.runtime.FabricLoadContext;
import net.fabricmc.api.ClientModInitializer;
import com.lampyt.salmamod.SalmaMod;
import com.lampyt.salmamod.client.SalmaModClient;

public class FabricSalmaModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(SalmaMod.MOD_ID, FabricLoadContext.INSTANCE, SalmaModClient::initialize);
    }
}
