package no.dirik.GeneralStuff;

import no.dirik.GeneralStuff.Commands.CommandSetPetNames;
import no.dirik.GeneralStuff.Commands.CommandSit;
import no.dirik.GeneralStuff.Commands.CommandStand;
import no.dirik.GeneralStuff.Commands.CommandUwU;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Jakob Holkestad Molnes
 * This class is the main class of the plugin.
 */
public class Main extends JavaPlugin {
    McLogger log = new McLogger();
    @Override
    public void onEnable() {
       log.info("GeneralStuff enabled!");
        getServer().getPluginManager().registerEvents(new EventListeners(),this);

        log.info("Enabling uwu...");
        this.getCommand("uwu").setExecutor(new CommandUwU());

        log.info("Enabling sit...");
        this.getCommand("sit").setExecutor(new CommandSit());

        log.info("Enabling stand...");
        this.getCommand("stand").setExecutor(new CommandStand());

        log.info("Enabling Random pet name...");
        this.getCommand("randompetnames").setExecutor(new CommandSetPetNames());


        log.info("Enabled everything!!!");
    }

    @Override
    public void onDisable() {
        getLogger().info("GeneralStuff disabled!");

    }
}