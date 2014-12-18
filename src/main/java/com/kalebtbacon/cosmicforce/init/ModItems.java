package com.kalebtbacon.cosmicforce.init;


import com.kalebtbacon.cosmicforce.item.ItemCF;
import com.kalebtbacon.cosmicforce.item.ItemCosmicIron;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemCF CosmicIron = new ItemCosmicIron();

    public static  void init()
    {
        GameRegistry.registerItem(CosmicIron, "CosmicIron");
    }
}
