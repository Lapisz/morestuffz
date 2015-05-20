package com.lapisz.morestuffz.Main;
import com.lapisz.morestuffz.*;
import net.minecraft.client.renderer.entity.RenderSnowball;

import com.lapisz.morestuffz.entity.EntityThrownTnt;
import com.lapisz.morestuffz.item.MItems;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {
	public void registerRenderInfo(){
		RenderingRegistry.registerEntityRenderingHandler(EntityThrownTnt.class, new RenderSnowball(MItems.tossableTnt));
	}
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
