package com.lampyt.salmamod.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.blay09.mods.kuma.api.InputBinding;
import net.blay09.mods.kuma.api.Kuma;
import net.blay09.mods.kuma.api.ManagedKeyMapping;
import com.lampyt.salmamod.SalmaMod;

import static com.lampyt.salmamod.SalmaMod.id;

public class ModKeyMappings {

    public static ManagedKeyMapping yourKey;

    public static void initialize() {
        yourKey = Kuma.createKeyMapping(id("your_key"))
                .withDefault(InputBinding.key(InputConstants.KEY_B))
                .handleScreenInput(event -> {
                    SalmaMod.logger.info("B was pressed - " + SalmaMod.MOD_ID);
                    return true;
                })
                .build();
    }
}
