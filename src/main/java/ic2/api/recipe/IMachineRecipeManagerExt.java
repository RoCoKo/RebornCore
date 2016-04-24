package ic2.api.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public interface IMachineRecipeManagerExt extends IMachineRecipeManager
{
	boolean addRecipe(IRecipeInput p0, NBTTagCompound p1, boolean p2, ItemStack... p3);
}