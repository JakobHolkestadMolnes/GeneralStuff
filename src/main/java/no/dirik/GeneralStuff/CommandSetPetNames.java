package no.dirik.GeneralStuff;

import static net.kyori.adventure.text.minimessage.tag.standard.StandardTags.color;

import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;

import java.util.ArrayList;

/**
 * @author Jakob Holkestad Molnes
 *
 *         This command gives tamed wolves and cats a random name from a list of
 *         names.
 */
public class CommandSetPetNames implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String[] names = new RandomDogNames().getNames();

        if (sender instanceof Player player) {
            GetTamedEntities getTamedEntities = new GetTamedEntities(player);

            ArrayList<Entity> entities = getTamedEntities.getTamedEntities();

            for (Entity mob : entities) {
                String randomName = (names[(int) (Math.random() * names.length)]);
                String randomName2 = (names[(int) (Math.random() * names.length)]);
                TextColor randomColor = TextColor.color(
                    (int) (Math.random() * 255), (int) (Math.random() * 255),
                    (int) (Math.random() * 255));
                TextColor randomColor2 = TextColor.color(
                    (int) (Math.random() * 255), (int) (Math.random() * 255),
                    (int) (Math.random() * 255));

                final TextComponent name = Component.text(randomName)
                .color(randomColor)
                    .append(Component.text(randomName2, randomColor2));

                mob.customName(name);
                mob.setCustomNameVisible(true);
            }
        }
        return true;
    }

}