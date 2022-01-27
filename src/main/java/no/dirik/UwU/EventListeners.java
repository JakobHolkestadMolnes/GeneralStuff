package no.dirik.UwU;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class EventListeners implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("Welcome to the Dirik Minecraft server!");
        player.sendMessage("Here's a stick!");
        player.getInventory().addItem(new ItemStack(Material.STICK, 1));
    }
}
