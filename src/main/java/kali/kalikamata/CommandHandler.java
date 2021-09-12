package kali.kalikamata;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {
    private WikiCommand plugin;

    public CommandHandler(WikiCommand plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players may use this command!");
            return true;
        }
        if (command.getName().equals("wiki")) {
            // do stuff...
            sender.sendMessage(ChatColor.GREEN + WikiCommand.URLHashMap.get("wiki"));
            return true;
        }
        if (command.getName().equals("web")) {
            // do stuff...
            sender.sendMessage(ChatColor.GREEN + WikiCommand.URLHashMap.get("web"));
            return true;
        }
        if (command.getName().equals("map")) {
            // do stuff...
            sender.sendMessage(ChatColor.GREEN + WikiCommand.URLHashMap.get("map"));
            return true;
        }
        if (command.getName().equals("recipes")) {
            // do stuff...
            sender.sendMessage(ChatColor.GREEN + WikiCommand.URLHashMap.get("recipes"));
            return true;
        }
        if (command.getName().equals("links")) {
            // do stuff...
            sender.sendMessage(ChatColor.GREEN + WikiCommand.URLHashMap.get("links"));
            return true;
        }
        return false;
    }
}