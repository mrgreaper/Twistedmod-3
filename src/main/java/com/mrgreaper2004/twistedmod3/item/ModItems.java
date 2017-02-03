package com.mrgreaper2004.twistedmod3.item;

import com.mrgreaper2004.twistedmod3.TwistedMod3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by mrgre on 31/01/2017.
 */
public class ModItems {

    public static Item bunnySword;
    public static Item bunnyDead;
    public static Item deathOrb;
    public static Item orphanLeg;
    public static Item orphanBalloon;
    public static Item bunnyElectrified;
    public static Item bunnyHilt;

    public static void preInit(){
        //this is where we will initialise the items
        //twistedModItem = new Item().setUnlocalizedName("twistedmod_item").setCreativeTab(TwistedMod3.tabTwistedMod);
        bunnyDead = new ItemBunnyDead("bunny_dead");
        bunnySword = new ItemBunnySword(EnumHelper.addToolMaterial("bunnyFlesh",3,100,8.0F,10.0F,22),"bunny_sword");
        deathOrb = new ItemDeathOrb("death_orb");
        orphanLeg = new ItemOrphanLeg("orphan_leg");
        orphanBalloon = new ItemOrphanBalloon("orphan_balloon");
        bunnyElectrified = new ItemBunnyElectrified("bunny_electrified");
        bunnyHilt = new ItemBunnyHilt("bunny_hilt");
        registerItems();
    }

    public static void registerItems(){
        GameRegistry.register(bunnySword,new ResourceLocation(TwistedMod3.MODID,"bunny_sword"));
        GameRegistry.register(bunnyDead,new ResourceLocation(TwistedMod3.MODID,"bunny_dead"));
        GameRegistry.register(deathOrb,new ResourceLocation(TwistedMod3.MODID,"death_orb"));
        GameRegistry.register(orphanLeg,new ResourceLocation(TwistedMod3.MODID,"orphan_leg"));
        GameRegistry.register(orphanBalloon,new ResourceLocation(TwistedMod3.MODID,"orphan_balloon"));
        GameRegistry.register(bunnyElectrified,new ResourceLocation(TwistedMod3.MODID,"bunny_electrified"));
        GameRegistry.register(bunnyHilt,new ResourceLocation(TwistedMod3.MODID,"bunny_hilt"));
    }

    public static void registerRenders(){
        registerRender(bunnySword);
        registerRender(bunnyDead);
        //registerRender(deathOrb);
        registerRender(orphanLeg);
        registerRender(orphanBalloon);
        registerRender(bunnyElectrified);
        registerRender(bunnyHilt);

    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(TwistedMod3.MODID+":"+item.getUnlocalizedName().substring(5),"inventory"));//substring to remove "item."
    }

}
