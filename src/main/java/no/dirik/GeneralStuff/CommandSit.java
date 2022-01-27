package no.dirik.GeneralStuff;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;

import java.util.ArrayList;

public class CommandSit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            GetTamedEntities getTamedEntities = new GetTamedEntities(player);

            ArrayList<Entity> entities = getTamedEntities.getTamedEntities();

            for (Entity mob : entities) {
                if (mob instanceof Sittable && !((Sittable) mob).isSitting()) {
                    ((Sittable) mob).setSitting(true);
                }
                else {
                    player.sendMessage("§c" + mob.getName() + " is already sitting.");
                }
            }
        }
        return true;
    }

}