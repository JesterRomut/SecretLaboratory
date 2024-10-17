package uk.jesterromut.sl.fabriclike;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import uk.jesterromut.sl.SecretLaboratoryCommands;
import uk.jesterromut.sl.SecretLaboratoryMod;

public final class ExampleModFabricLike {
    public static void init() {
        // Run our common setup.
        SecretLaboratoryMod.init();

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            SecretLaboratoryMod.registerCommands(dispatcher);
        });
//
//        SecretLaboratoryItems.getCreativeTabs().forEach(
//                (String id, CreativeTab tab) -> {
//                    ItemGroup myGroup = FabricItemGroupBuilder.create(SecretLaboratoryMod.id(id))
//                            .icon(tab.getIcon()::getDefaultStack)
//                            .appendItems((stacks) -> {
//                                tab.getItems().forEach((item) -> {
//                                    stacks.add(item.getDefaultStack());
//                                });
//                            })
//                            .build();
//                }
//        );


    }
}
