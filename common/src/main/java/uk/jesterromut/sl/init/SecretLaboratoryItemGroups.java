package uk.jesterromut.sl.init;

import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import uk.jesterromut.sl.SecretLaboratoryMod;

import static uk.jesterromut.sl.init.SecretLaboratoryItems.KEYCARD_0;

public class SecretLaboratoryItemGroups {

    public static final ItemGroup MAIN_TAB = CreativeTabRegistry.create(
            SecretLaboratoryMod.id("main_tab"), // Tab ID
            () -> new ItemStack(KEYCARD_0::get) // Icon
    );
}
