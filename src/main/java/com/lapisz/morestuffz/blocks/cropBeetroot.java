package com.lapisz.morestuffz.blocks;

import com.lapisz.morestuffz.item.MItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class cropBeetroot extends BlockCrops{
   
   @Override
	protected Item func_149866_i()
     {
        return MItems.seedsBeetroot;
     }

   @Override
    protected Item func_149865_P()
     {
        return MItems.beetroot;
     }
}
