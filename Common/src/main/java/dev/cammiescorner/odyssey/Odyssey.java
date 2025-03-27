package dev.cammiescorner.odyssey;

import dev.upcraft.sparkweave.api.entrypoint.MainEntryPoint;
import dev.upcraft.sparkweave.api.platform.ModContainer;
import net.minecraft.resources.ResourceLocation;

public class Odyssey implements MainEntryPoint {
    public static final String MOD_ID = "odyssey";

    @Override
    public void onInitialize(ModContainer mod) {

    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
