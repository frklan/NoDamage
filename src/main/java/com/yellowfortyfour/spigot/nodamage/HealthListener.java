package com.yellowfortyfour.spigot.nodamage;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class HealthListener implements Listener
{
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
	{
		Player player = event.getPlayer();

		Bukkit.getLogger().info("Player " + player.getDisplayName() + " joined, setting imortality.");

		player.setInvulnerable(true);

		if(!player.isOp())
			player.setCanPickupItems(false);
	}

	@EventHandler
		public void onPlayerLeave(PlayerQuitEvent event)
		{
			Player player = event.getPlayer();
			player.setInvulnerable(false);
			player.setCanPickupItems(true);
		}
}
