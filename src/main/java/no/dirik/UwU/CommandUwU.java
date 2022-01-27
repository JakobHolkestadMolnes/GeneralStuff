package no.dirik.UwU;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.awt.*;

public class CommandUwU implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            player.sendMessage("UwU");

            ItemStack stick = new ItemStack(Material.STICK);

            stick.setAmount(1);

            player.getInventory().addItem(stick);
        }
        return true;
    }
}
