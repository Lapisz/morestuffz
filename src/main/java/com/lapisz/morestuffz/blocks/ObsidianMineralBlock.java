package com.lapisz.morestuffz.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsidianMineralBlock extends Block{

	protected ObsidianMineralBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", 3);
	}

}
