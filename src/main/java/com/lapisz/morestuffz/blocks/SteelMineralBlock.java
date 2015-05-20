package com.lapisz.morestuffz.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SteelMineralBlock extends Block{

	protected SteelMineralBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 2);
	}

}
