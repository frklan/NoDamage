package com.yellowfortyfour.spigot.nodamage;

import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class NoDamagePlugin extends JavaPlugin 
{
	@Override
	public void onEnable()
	{
		@SuppressWarnings("unused")
		Metrics metrics = new Metrics(this);
		
		Bukkit.getServer().getPluginManager().registerEvents(new HealthListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerGlow(), this);
	}
}
