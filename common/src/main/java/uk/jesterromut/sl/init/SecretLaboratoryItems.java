package uk.jesterromut.sl.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import uk.jesterromut.sl.item.KeycardItem;
import uk.jesterromut.sl.item.MicroHIDItem;

import static uk.jesterromut.sl.SecretLaboratoryMod.MOD_ID;
import static uk.jesterromut.sl.init.SecretLaboratoryItemGroups.MAIN_TAB;

public class SecretLaboratoryItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    //region Keycards 0-10
    public static final RegistrySupplier<Item> KEYCARD_0 = ITEMS.register(
            "keycard_0",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    public static final RegistrySupplier<Item> KEYCARD_1 = ITEMS.register(
            "keycard_1",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    public static final RegistrySupplier<Item> KEYCARD_2 = ITEMS.register(
            "keycard_2",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    public static final RegistrySupplier<Item> KEYCARD_3 = ITEMS.register(
            "keycard_3",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    public static final RegistrySupplier<Item> KEYCARD_4 = ITEMS.register(
            "keycard_4",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    public static final RegistrySupplier<Item> KEYCARD_5 = ITEMS.register(
            "keycard_5",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    public static final RegistrySupplier<Item> KEYCARD_6 = ITEMS.register(
            "keycard_6",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    public static final RegistrySupplier<Item> KEYCARD_7 = ITEMS.register(
            "keycard_7",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    public static final RegistrySupplier<Item> KEYCARD_8 = ITEMS.register(
            "keycard_8",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    public static final RegistrySupplier<Item> KEYCARD_9 = ITEMS.register(
            "keycard_9",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    public static final RegistrySupplier<Item> KEYCARD_10 = ITEMS.register(
            "keycard_10",
            () -> new KeycardItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );
    //endregion

    //Micro HID
    public static final RegistrySupplier<Item> MICRO_HID = ITEMS.register(
            "micro_hid",
            () -> new MicroHIDItem(new Item.Settings().maxCount(16).group(MAIN_TAB))
    );


//    @Getter
//    private static Map<String, CreativeTab> creativeTabs = Map.of();

    public static void init() {
        ITEMS.register();
//        DefaultedList<ItemStack> items = DefaultedList.ofSize(2, ItemStack.EMPTY);
//        items.set(0, new ItemStack(Items.ITEM_FRAME));
//        items.set(1, new ItemStack(KEYCARD_0.get()));
//        MAIN_TAB.appendStacks(items);
    }
}
