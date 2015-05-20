package com.lapisz.morestuffz.blocks;

import java.awt.List;
import java.util.Random;

import com.lapisz.morestuffz.item.MItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SpecialStone extends Block{

	protected SpecialStone(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 0);
	}
	public int quantityDropped(Random par1Random){
		return 1;
		}

	public Item getItemDropped(int par1, Random par2Random, int par3){
		return Item.getItemFromBlock(MBlocks.SpecialCobble);
		}
	
}
