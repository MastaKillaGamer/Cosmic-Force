package com.kalebtbacon.cosmicforce.item;


import com.kalebtbacon.cosmicforce.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCF extends Item
{
    public ItemCF()
    {
        super();

    }
    @Override
    public String getUnlocalizedName()
    {
    return String.format("item.%s%s", Reference.MOD_ID.toLowerCase(),getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
    return String.format("item.%s%s", Reference.MOD_ID.toLowerCase(),getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
