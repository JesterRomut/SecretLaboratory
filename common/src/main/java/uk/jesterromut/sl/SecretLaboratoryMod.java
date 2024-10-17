package uk.jesterromut.sl;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.LiteralCommandNode;
import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.CommandRegistrationEvent;
import dev.architectury.event.events.common.EntityEvent;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import uk.jesterromut.sl.init.SecretLaboratoryItems;
import uk.jesterromut.sl.platform.PlatformHelper;

import java.util.function.Consumer;
import java.util.logging.Logger;

import static net.minecraft.server.command.CommandManager.literal;
import static net.minecraft.server.command.CommandManager.*;

public final class SecretLaboratoryMod  {
    public static final String MOD_ID = "jr_secret_laboratory";

    public static void init() {
        // Write common init code here.
        SecretLaboratoryItems.init();

        EntityEvent.LIVING_HURT.register((LivingEntity entity, DamageSource source, float amount) -> {
            Logger.getGlobal().info("11111");
            return EventResult.interruptFalse();
        });

        CommandRegistrationEvent.EVENT.register((dispatcher, registryAccess, b) -> {
            LiteralCommandNode<ServerCommandSource> rootNode = CommandManager
                    .literal("secretlab")
                    .requires(source -> source.hasPermissionLevel(2))
                    .build();

            LiteralCommandNode<ServerCommandSource> unequip = CommandManager
                    .literal("unequip")
                    .then(CommandManager.argument("player", EntityArgumentType.players())
                            .executes(context -> {
                                Logger.getGlobal().info("11111");
                                return 1;
                            })
                    )
                    .build();
            rootNode.addChild(unequip);

            dispatcher.getRoot().addChild(rootNode);

            Logger.getGlobal().info("11111");
        });
    }


    public static void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(SecretLaboratoryCommands.SCP_MORPH);
    }

    public static Identifier id(String id) {
        return new Identifier(MOD_ID, id);
    }
}
