package com.yellowfortyfour.spigot.nodamage;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class HealthListener implements Listener
{
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) 
	{
		Player player = event.getPlayer();
		
		Bukkit.getLogger().info("Player " + player.getDisplayName() + " joined, setting imortality.");
		
		player.setInvulnerable(true);
		
		
		/* Testing a few methods.. */
		if(player.isOp())
			player.setGlowing(true);
		
		player.setCanPickupItems(false);
	}
}
