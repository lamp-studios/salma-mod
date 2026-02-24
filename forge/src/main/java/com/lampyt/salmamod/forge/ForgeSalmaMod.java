package com.lampyt.salmamod.forge;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.forge.platform.runtime.ForgeLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import com.lampyt.salmamod.SalmaMod;
import com.lampyt.salmamod.client.SalmaModClient;

@Mod(SalmaMod.MOD_ID)
public class ForgeSalmaMod {

    public ForgeSalmaMod(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModBusGroup());
        Balm.initializeMod(SalmaMod.MOD_ID, loadContext, SalmaMod::initialize);
        if (FMLEnvironment.dist.isClient()) {
            BalmClient.initializeMod(SalmaMod.MOD_ID, loadContext, SalmaModClient::initialize);
        }
    }

}
