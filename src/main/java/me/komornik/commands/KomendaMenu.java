package me.komornik.commands;

import me.komornik.guis.glownegui;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KomendaMenu implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

            if(p.hasPermission("AdminPanel.Open")) {
                p.openInventory(glownegui.glownyPanel());
            }else {
                p.sendMessage(ChatColor.RED + "Nie masz permisji do uzywania panelu administratora!");
            }



         return true;
    }
}
