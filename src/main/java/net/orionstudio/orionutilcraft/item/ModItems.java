package net.orionstudio.orionutilcraft.item;


import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.orionstudio.orionutilcraft.OrionUtilCraft;
import net.orionstudio.orionutilcraft.item.custom.epicitems;
import net.orionstudio.orionutilcraft.item.customeconomy.customgraycoin;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OrionUtilCraft.MOD_ID);

    // Item Add
    // MINERAL

    public static final RegistryObject<Item> SAPPHIRERELIC = ITEMS.register("sapphire_relic",
            () -> new epicitems(new Item.Properties()
                    .group(ModItemGroup.ORIONUTIL_GROUP)
                    .maxStackSize(10)
                    .rarity(Rarity.EPIC)));

    // Economy
    public static final RegistryObject<Item> GRAYCOIN = ITEMS.register("oriongraycoin",
            () -> new customgraycoin(new Item.Properties()
                    .group(ModItemGroup.ORIOECONOMY_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
