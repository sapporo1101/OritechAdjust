package io.github.sapporo1101.oritechadjust;

import io.github.sapporo1101.oritechadjust.resource.ResourceModifier;

public final class Oritechadjust {
    public static final String MOD_ID = "oritechadjust";

    public static void init() {
        // Write common init code here.
    }

    public static void registerModifiers() {
        ResourceModifier.registerQuickModifier("data/oritech/recipe/foundry/alloy/netherite.json", data -> new byte[0]);

        ResourceModifier.registerQuickModifier("data/oritech/recipe/foundry/alloy/inverse/netherite.json", data -> new byte[0]);
    }
}
