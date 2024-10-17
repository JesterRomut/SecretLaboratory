package uk.jesterromut.sl.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import uk.jesterromut.sl.SecretLaboratoryMod;
import uk.jesterromut.sl.SecretLaboratoryModClient;

@Mod(SecretLaboratoryMod.MOD_ID)
public final class ExampleModForge {

    public ExampleModForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(SecretLaboratoryMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        SecretLaboratoryMod.init();

    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeEvents {
//        @SubscribeEvent
//        public static void registerCommand(RegisterCommandsEvent event) {
//            event.getDispatcher().register(SecretLaboratoryCommands.SCP_MORPH);
//        }
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientEvents {
        @SubscribeEvent
        public static void process(FMLClientSetupEvent event) {
            event.enqueueWork(SecretLaboratoryModClient::init);
        }
    }
}
