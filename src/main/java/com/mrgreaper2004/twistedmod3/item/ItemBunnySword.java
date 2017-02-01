package com.mrgreaper2004.twistedmod3.item;

import com.mrgreaper2004.twistedmod3.TwistedMod3;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

/**
 * Created by mrgre on 01/02/2017.
 */
public class ItemBunnySword extends ItemSword {

    public ItemBunnySword(ToolMaterial material,String name) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(TwistedMod3.tabTwistedMod);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

        return super.hitEntity(stack, target, attacker);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("Made from a living bunny");
        tooltip.add("With a Stick ins...somewhere");
        tooltip.add("Looks...angry");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }
}
