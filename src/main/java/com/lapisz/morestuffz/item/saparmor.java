package com.lapisz.morestuffz.item;

import com.lapisz.morestuffz.lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class saparmor extends ItemArmor {

	public saparmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MItems.saphelm || stack.getItem() == MItems.sapbody || stack.getItem() == MItems.sapboots){
        	return RefStrings.MODID + ":textures/armor/saparmor1.png";
        }else if(stack.getItem() == MItems.sappants){
        	return RefStrings.MODID + ":textures/armor/saparmor2.png";
        }else{
        	return null;
        }
    }
}
