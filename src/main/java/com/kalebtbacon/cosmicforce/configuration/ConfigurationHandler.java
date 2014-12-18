package com.kalebtbacon.cosmicforce.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);

        try
        {
            //Load the configuration file
            configuration.load();

            //Read in properties from configuration file
        }
        catch (Exception e)
        {
            //Log the exception
        }
        finally
        {
            //Save the configuration file
            configuration.save();
        }
    }
}
