package com.kalebtbacon.cosmicforce;

import com.kalebtbacon.cosmicforce.configuration.ConfigurationHandler;
import com.kalebtbacon.cosmicforce.init.ModItems;
import com.kalebtbacon.cosmicforce.reference.Reference;
import com.kalebtbacon.cosmicforce.proxy.IProxy;
import com.kalebtbacon.cosmicforce.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION)
public class CosmicForce
{

    @Mod.Instance("CosmicForce")
    public static CosmicForce instance;

    @SidedProxy(clientSide = "com.kalebtbacon.cosmicforce.proxy.ClientProxy", serverSide = "com.kalebtbacon.cosmicforce.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Level 1 Initialization Complete");
        LogHelper.debug("Cosmic Force is Working fine :D");

        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Level 2 Initialization Complete!");

    }
    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Level 3 Initialization Complete!");
        LogHelper.warn("This is a ALPHA. Expect and report Bugs so i can Smash Them");

    }

}
