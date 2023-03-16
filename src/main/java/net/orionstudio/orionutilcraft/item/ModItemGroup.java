package net.orionstudio.orionutilcraft.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup ORIONUTIL_GROUP = new ItemGroup("orionutilmodtab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.DESERT_RELIC.get());
        }
    };

    // Economy
    public static final ItemGroup ORIOECONOMY_GROUP = new ItemGroup("orioneconomytab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.TURQUOISECOIN.get());
        }
    };

}
