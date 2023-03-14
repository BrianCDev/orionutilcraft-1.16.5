package net.orionstudio.orionutilcraft.item;


import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.orionstudio.orionutilcraft.OrionUtilCraft;
import net.orionstudio.orionutilcraft.item.custom.reliques;
import net.orionstudio.orionutilcraft.item.customeconomy.custombluecoin;
import net.orionstudio.orionutilcraft.item.customeconomy.custombrowncoin;
import net.orionstudio.orionutilcraft.item.customeconomy.customgoldcoin;
import net.orionstudio.orionutilcraft.item.customeconomy.customgraycoin;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OrionUtilCraft.MOD_ID);

    // Item Add
    // MINERAL

    public static final RegistryObject<Item> SAPPHIRE_RELIC = ITEMS.register("sapphire_relic",
            () -> new reliques(new Item.Properties()
                    .group(ModItemGroup.ORIONUTIL_GROUP)
                    .maxStackSize(2)
                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> FIRE_RELIC = ITEMS.register("fire_relic",
            () -> new reliques(new Item.Properties()
                    .group(ModItemGroup.ORIONUTIL_GROUP)
                    .rarity(Rarity.RARE)
                    .maxStackSize(2)));

    public static final RegistryObject<Item> DESERT_RELIC = ITEMS.register("desert_relic",
            () -> new reliques(new Item.Properties()
                    .group(ModItemGroup.ORIONUTIL_GROUP)
                    .maxStackSize(2)
                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> WATER_RELIC = ITEMS.register("water_relic",
            () -> new reliques(new Item.Properties()
                    .group(ModItemGroup.ORIONUTIL_GROUP)
                    .maxStackSize(2)
                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> AQUAMARINE_RELIC = ITEMS.register("aquamarine_relic",
            () -> new reliques(new Item.Properties()
                    .group(ModItemGroup.ORIONUTIL_GROUP)
                    .maxStackSize(2)
                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> AMETHYST_RELIC = ITEMS.register("amethyst_relic",
            () -> new reliques(new Item.Properties()
                    .group(ModItemGroup.ORIONUTIL_GROUP)
                    .maxStackSize(2)
                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> GRANATE_RELIC = ITEMS.register("granate_relic",
            () -> new reliques(new Item.Properties()
                    .group(ModItemGroup.ORIONUTIL_GROUP)
                    .maxStackSize(2)
                    .rarity(Rarity.RARE)));

    // Economy

    public static final RegistryObject<Item> BROWNCOIN = ITEMS.register("orionbrowncoin",
            () -> new custombrowncoin(new Item.Properties()
                    .group(ModItemGroup.ORIOECONOMY_GROUP)
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> GRAYCOIN = ITEMS.register("oriongraycoin",
            () -> new customgraycoin(new Item.Properties()
                    .group(ModItemGroup.ORIOECONOMY_GROUP)
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> GOLDCOIN = ITEMS.register("oriongoldcoin",
            () -> new customgoldcoin(new Item.Properties()
                    .group(ModItemGroup.ORIOECONOMY_GROUP)
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> a = ITEMS.register("orionbluecoin",
            () -> new custombluecoin(new Item.Properties()
                    .group(ModItemGroup.ORIOECONOMY_GROUP)
                    .rarity(Rarity.UNCOMMON)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
