package no.dirik.GeneralStuff;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

/**
 * @author Jakob Holkestad Molnes
 *
 *         This class is used to listen for events in the server.
 */
public class EventListeners implements Listener {
    /**
     * This method is used to listen for when a player joins the server. Gives the
     * user a stick.
     * 
     * @param event The event that is being listened for.
     */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("Welcome to the Dirik Minecraft server!");
        player.sendMessage("Here's a stick!");
        player.getInventory().addItem(new ItemStack(Material.STICK, 1));
    }
}
