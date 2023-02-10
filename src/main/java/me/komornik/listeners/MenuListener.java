package me.komornik.listeners;

import me.komornik.gui.czaspanel;
import me.komornik.gui.glownegui;
import me.komornik.gui.pogodagui;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
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

            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Pogoda")) {
                p.closeInventory();
                p.openInventory(pogodagui.PogodaPanel());

            }
            e.setCancelled(true);
        }
        //Czas Gry
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Panel Administratora - Czas")) {

            if (e.getCurrentItem() == null) {
                return;
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Dzien")) {
                Bukkit.getWorlds().get(0).setTime(10000);
                p.sendMessage(ChatColor.YELLOW + "Pomyślnie ustawiono czas gry na sloneczny");
            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Noc")) {
                Bukkit.getWorlds().get(0).setTime(20000);
                p.sendMessage(ChatColor.YELLOW + "Pomyślnie ustawiono czas gry na noc");
            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "Wroc do panelu")) {
                p.closeInventory();
                p.openInventory(glownegui.glownyPanel());
            }
            e.setCancelled(true);
        }
        //Pogoda
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Panel Administratora - Pogoda")) {
            World world = Bukkit.getWorlds().get(0);


            if (e.getCurrentItem() == null) {
                return;
            }


            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Sloneczna")) {
                world.setStorm(false);
                world.setThundering(false);


            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Deszczowa")) {
                world.setStorm(true);
                world.setThundering(false);


            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Burza")) {
                world.setStorm(true);
                world.setThundering(false);


            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "Wroc do panelu")) {
                p.closeInventory();
                p.openInventory(glownegui.glownyPanel());
            }
            e.setCancelled(true);
        }
    }
}
