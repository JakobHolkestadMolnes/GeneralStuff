package no.dirik.UwU;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sittable;

import java.util.ArrayList;

public class CommandAllStandUp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            GetAllTamedEntities getAllTamedEntities = new GetAllTamedEntities(player);

            ArrayList<Entity> entities = getAllTamedEntities.getTamedEntities();

            for (Entity mob : entities) {
                if (mob instanceof Sittable && ((Sittable) mob).isSitting()) {
                    ((Sittable) mob).setSitting(false);
                }
                else {
                    player.sendMessage("§c" + mob.getName() + " is not sitting.");
                }
            }
        }
        return true;
    }

}