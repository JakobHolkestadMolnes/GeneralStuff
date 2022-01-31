package no.dirik.GeneralStuff;


import static org.bukkit.Bukkit.getLogger;

/**
 * @author Jakob Holkestad Molnes
 *
 * This class is used to log messages to the console.
 */
public class McLogger {
    /**
     * Constructor for McLogger. (does nothing)
     */
    public McLogger(){

    }

    /**
     * Logs a message to the console.
     * @param message The message to log.
     */
    public void info(String message){
        getLogger().info(message);
    }

    /**
     * Logs a warning to the console.
     * @param message The message to log.
     */
    public void warning(String message){
        getLogger().warning(message);
    }

    /**
     * Logs a severe error to the console.
     * @param message The message to log.
     */
    public void severe(String message){
        getLogger().severe(message);
    }
}
