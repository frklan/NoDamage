package com.yellowfortyfour.spigot.nodamage;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerGlow implements Listener
{
	private static final String GLOW_PERMISSION = "nodamage.glow";
	
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) 
	{
		Player player = event.getPlayer();

		if(player.hasPermission(GLOW_PERMISSION))
			player.setGlowing(true);
		else
			player.setGlowing(false);
	}
	
	@EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) 
    {
		Player player = event.getPlayer();
		player.setGlowing(false);
    }
}
