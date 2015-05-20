package com.lapisz.morestuffz.blocks;

import java.util.Random;

import com.lapisz.morestuffz.item.MItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;


public class RubyOre extends Block{

	protected RubyOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	public int quantityDropped(Random par1Random){
		return 2;
		}

	public Item getItemDropped(int par1, Random par2Random, int par3){
		return MItems.gemRuby;
		}

}
