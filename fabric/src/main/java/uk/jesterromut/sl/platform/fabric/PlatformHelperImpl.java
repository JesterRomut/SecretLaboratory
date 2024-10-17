package uk.jesterromut.sl.platform.fabric;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

import java.util.function.Consumer;

import static net.minecraft.server.command.CommandManager.literal;

public class PlatformHelperImpl {

    public static void registerCommand(Consumer<CommandDispatcher<ServerCommandSource>> registerFunc) {
    }

    public static void registerCommand() {
    }

    public static LiteralArgumentBuilder<ServerCommandSource> register() {
        return literal("morph")
                .executes(context -> {
                    // For versions below 1.19, replace "Text.literal" with "new LiteralText".
                    // For versions below 1.20, remode "() ->" directly.
                    context.getSource().sendFeedback(Text.literal("Called /foo with no arguments"), false);

                    return 1;
                });
    }
}
