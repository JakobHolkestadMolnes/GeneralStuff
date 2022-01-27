package no.dirik.GeneralStuff;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


import java.util.ArrayList;

public class CommandSetPetNames implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            String[] names = new RandomDogNames().getNames();

            if (sender instanceof Player player) {
                GetTamedEntities getTamedEntities = new GetTamedEntities(player);

                ArrayList<Entity> entities = getTamedEntities.getTamedEntities();

                for (Entity mob : entities) {

                    mob.setCustomName(names[(int) (Math.random() * names.length)]);
                    mob.setCustomNameVisible(true);
                }
            }
            return true;
        }

    }