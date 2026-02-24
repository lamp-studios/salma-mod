package com.lampyt.salmamod.api;

import java.lang.reflect.InvocationTargetException;

public class SalmaModAPI {

    public static final String MOD_ID = "salmamod";

    private static final InternalMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalMethods) Class.forName("com.lampyt.salmamod.InternalMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
