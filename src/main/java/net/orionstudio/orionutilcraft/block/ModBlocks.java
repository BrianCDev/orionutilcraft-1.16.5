package net.orionstudio.orionutilcraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.orionstudio.orionutilcraft.OrionUtilCraft;
import net.orionstudio.orionutilcraft.item.ModItemGroup;
import net.orionstudio.orionutilcraft.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, OrionUtilCraft.MOD_ID);

    // Blocks

    public static final RegistryObject<Block> TEST_BLOCK = registerBlock("test_block",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOD)
                    .harvestLevel(1)
                    .harvestTool(ToolType.AXE)
                    .setRequiresTool()
                    .hardnessAndResistance(2f)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }

    // Assign a group
    private static<T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.ORIONUTIL_GROUP)));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
