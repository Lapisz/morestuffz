package com.lapisz.morestuffz.item;

import com.lapisz.morestuffz.entity.EntityThrownTnt;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class tossableTnt extends Item{
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player){
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		world.playSoundAtEntity(player, "random.pop", 0.7f, 0.8f);
		
		if(world.isRemote){
			world.spawnEntityInWorld(new EntityThrownTnt(world, player));
		}
		
		return itemstack;
	}

}
