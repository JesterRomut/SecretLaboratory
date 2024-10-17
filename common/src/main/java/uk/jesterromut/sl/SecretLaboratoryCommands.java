package uk.jesterromut.sl;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.literal;

public final class SecretLaboratoryCommands {
    public static final LiteralArgumentBuilder<ServerCommandSource> SCP_MORPH = literal("morph")
        .executes(context -> {
            // For versions below 1.19, replace "Text.literal" with "new LiteralText".
            // For versions below 1.20, remode "() ->" directly.
            context.getSource().sendFeedback(Text.literal("Called /foo with no arguments"), false);

            return 1;
        });
}
