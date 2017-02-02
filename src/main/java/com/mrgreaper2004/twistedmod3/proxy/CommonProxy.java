package com.mrgreaper2004.twistedmod3.proxy;

import com.mrgreaper2004.twistedmod3.handlers.SoundHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by mrgre on 31/01/2017.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event){
        //soundhandler (as per the psi mod)
        SoundHandler.init();

    }

    public void init(FMLInitializationEvent event){

    }

    public void postInit(FMLPostInitializationEvent event){

    }
}
