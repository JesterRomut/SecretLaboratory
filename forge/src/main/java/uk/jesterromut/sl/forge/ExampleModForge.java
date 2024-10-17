package uk.jesterromut.sl.forge;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.architectury.platform.forge.EventBuses;
import dev.architectury.registry.forge.CreativeTabRegistryImpl;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import uk.jesterromut.sl.SecretLaboratoryCommands;
import uk.jesterromut.sl.SecretLaboratoryMod;
import uk.jesterromut.sl.platform.forge.PlatformHelperImpl;

import java.util.logging.Logger;

@Mod(SecretLaboratoryMod.MOD_ID)
public final class ExampleModForge {

    public ExampleModForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(SecretLaboratoryMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        SecretLaboratoryMod.init();

        Logger.getGlobal().info("SecretLaboratory Mod Initialized");

    }


}
