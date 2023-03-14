package net.orionstudio.orionutilcraft.item.customeconomy;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class custombrowncoin extends Item {
    public custombrowncoin(Item.Properties properties) {super(properties);}


    @Override
    public void  addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tooltip.orionutilcraft.browncoin"));
        super.addInformation(stack, worldIn, tooltip, flagIn);

    }

}