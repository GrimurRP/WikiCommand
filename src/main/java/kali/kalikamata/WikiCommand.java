package kali.kalikamata;

import java.util.*;

import org.bukkit.event.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;

public final class WikiCommand extends JavaPlugin implements Listener {

    public static HashMap<String, String> URLHashMap = new HashMap<>();
    FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
        // Commands
        getCommand("wiki").setExecutor(new CommandHandler(this));
        getCommand("web").setExecutor(new CommandHandler(this));
        getCommand("map").setExecutor(new CommandHandler(this));
        getCommand("recipes").setExecutor(new CommandHandler(this));
        getCommand("links").setExecutor(new CommandHandler(this));
        getServer().getPluginManager().registerEvents(this, this);

        this.saveDefaultConfig();
        this.getConfig();

        URLHashMap = loadHashMap();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public HashMap<String, String> loadHashMap() {
        try {
            Map<String, Object> Map = config.getConfigurationSection("").getValues(false);
            HashMap<String, String> URLHashMap = new HashMap<String, String>((Map)Map);  // unchecked warning
            return URLHashMap;
        }
        catch(Exception e)
        {
            System.out.println("WikiCommand could not load from config.");
            HashMap<String, String> URLHashMap = new HashMap<String, String>();
            return URLHashMap;
        }
    }
}
