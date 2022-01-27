package no.dirik.UwU;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {
    McLogger log = new McLogger();
    @Override
    public void onEnable() {
       log.info("UwU enabled!");
        getServer().getPluginManager().registerEvents(new EventListeners(),this);

        log.info("Enabling uwu...");
        this.getCommand("uwu").setExecutor(new CommandUwU());

        log.info("Enabling sit...");
        this.getCommand("sit").setExecutor(new CommandSit());

        log.info("Enabling stand...");
        this.getCommand("stand").setExecutor(new CommandStand());

        log.info("Enabling Random pet name...");
        this.getCommand("randompetnames").setExecutor(new CommandSetPetNames());

        log.info("Enabling all stand up...");
        this.getCommand("alltamedstandup").setExecutor(new CommandAllStandUp());

        log.info("Enabling teleport all...");
        this.getCommand("teleportalltamed").setExecutor(new CommandTeleportAllTamed());
        log.info("Enabled everything!!!");
    }

    @Override
    public void onDisable() {
        getLogger().info("UwU disabled!");
    }
}