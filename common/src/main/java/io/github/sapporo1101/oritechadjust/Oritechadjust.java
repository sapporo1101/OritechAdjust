package io.github.sapporo1101.oritechadjust;

import com.google.gson.JsonParser;
import io.github.sapporo1101.oritechadjust.resource.ResourceModifier;

public final class Oritechadjust {
    public static final String MOD_ID = "oritechadjust";

    public static void init() {
        // Write common init code here.
    }

    public static void registerModifiers() {
        ResourceModifier.registerQuickModifier("data/oritech/recipe/foundry/alloy/netherite.json", data -> new byte[0]);

        ResourceModifier.registerQuickModifier("data/oritech/recipe/foundry/alloy/inverse/netherite.json", data -> new byte[0]);

        ResourceModifier.registerQuickModifier("data/oritech/recipe/grinder/ore/copper.json", data -> {
            var json = JsonParser.parseString(new String(data)).getAsJsonObject();
            json.getAsJsonArray("results").get(1).getAsJsonObject().addProperty("id", "oritech:small_gold_clump");
            return json.toString().getBytes();
        });

        ResourceModifier.registerStartsWithModifier("data/oritech/worldgen/", (path, data) -> {
            try (var modifiedData = Oritechadjust.class.getClassLoader().getResourceAsStream(path.replaceFirst("^data/", "dataMixin/"))) {
                if (modifiedData == null) return null;
                return modifiedData.readAllBytes();
            }
        });
    }
}
