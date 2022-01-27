package no.dirik.GeneralStuff;


import static org.bukkit.Bukkit.getLogger;

public class McLogger {
    public McLogger(){

    }
    public void info(String message){
        getLogger().info(message);
    }
    public void warning(String message){
        getLogger().warning(message);
    }
    public void severe(String message){
        getLogger().severe(message);
    }
}
