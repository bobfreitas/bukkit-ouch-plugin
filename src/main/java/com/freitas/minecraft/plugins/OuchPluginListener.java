package com.freitas.minecraft.plugins;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class OuchPluginListener implements Listener {
	
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		Player p = event.getPlayer();
		Block bb = event.getBlock();
		p.sendMessage("OUCH! That hurt!");
		p.sendMessage("You broke " + bb.getType().toString());
	}

}
