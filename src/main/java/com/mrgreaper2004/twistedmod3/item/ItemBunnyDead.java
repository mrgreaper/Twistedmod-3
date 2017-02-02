package com.mrgreaper2004.twistedmod3.item;

import com.mrgreaper2004.twistedmod3.TwistedMod3;
import com.mrgreaper2004.twistedmod3.handlers.SoundHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by mrgre on 01/02/2017.
 */
public class ItemBunnyDead extends Item {
    public ItemBunnyDead(String name) {
        setUnlocalizedName(name);
        setCreativeTab(TwistedMod3.tabTwistedMod);
        //setMaxStackSize(1);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
        if (!worldIn.isRemote) {
            worldIn.playSound(null,playerIn.posX,playerIn.posY,playerIn.posZ, SoundHandler.laugh, SoundCategory.PLAYERS, 1,1); //0.5F, (float) (0.5 + Math.random() * 0.5));
            playerIn.addChatComponentMessage(new TextComponentString("Right clicked"));
        }
        return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(worldIn.getBlockState(pos).getBlock()== Blocks.GRASS){
            worldIn.setBlockState(pos,Blocks.DIAMOND_BLOCK.getDefaultState());
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("Item Tooltip");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

    /*
    @Override
    public boolean hasEffect(ItemStack stack) {
        return super.hasEffect(stack);
    }
    */
}
