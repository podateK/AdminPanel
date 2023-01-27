package me.komornik.listeners;

import me.komornik.guis.czaspanel;
import me.komornik.guis.glownegui;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class MenuListener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Panel Administratora")) {

            if (e.getCurrentItem() == null) {
                return;
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Czas Gry")) {
                p.closeInventory();
                p.openInventory(czaspanel.CzasPanel());

            }
            e.setCancelled(true);
        }
        //Czas Gry
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Panel Administratora - Czas")) {

            if (e.getCurrentItem() == null) {
                return;
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Dzien")) {
                Bukkit.getWorld("world").setTime(10000);
                p.sendMessage(ChatColor.YELLOW + "Pomyślnie ustawiono czas gry na sloneczny");
                e.setCancelled(true);
            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Noc")) {
                Bukkit.getWorld("world").setTime(20000);
                p.sendMessage(ChatColor.YELLOW + "Pomyślnie ustawiono czas gry na noc");
                e.setCancelled(true);
            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "Wroc do panelu")) {
                p.closeInventory();
                p.openInventory(glownegui.glownyPanel());
            }

        }
    }
}
