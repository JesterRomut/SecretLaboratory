package uk.jesterromut.sl.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import uk.jesterromut.sl.fabriclike.ExampleModFabricLikeClient;

public final class ExampleModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        ExampleModFabricLikeClient.init();
    }
}
