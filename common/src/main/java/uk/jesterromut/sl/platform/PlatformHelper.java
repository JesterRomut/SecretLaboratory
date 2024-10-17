package uk.jesterromut.sl.platform;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

import java.util.function.Consumer;

import static net.minecraft.server.command.CommandManager.literal;

public final class PlatformHelper {
    //@ExpectPlatform
    public static void registerCommand() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static LiteralArgumentBuilder<ServerCommandSource> register() {
        throw new AssertionError();
    }
}
