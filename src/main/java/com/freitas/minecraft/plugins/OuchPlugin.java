package com.freitas.minecraft.plugins;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class OuchPlugin extends JavaPlugin {
	
	private OuchPluginListener blockListener = new OuchPluginListener();
	
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this.blockListener, this);
	}

}
