package me.komornik.listeners;

import me.komornik.gui.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class MenuListener implements Listener {


    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {
// glowne menu
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

            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Whitelista")) {
                p.closeInventory();
                p.openInventory(whitelistgui.whitelistPanel());
            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("TESTTTTT")) {
                p.closeInventory();
                p.openInventory(difficultypanel.diffPanel());
            }
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
            //Whitelista
            if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Panel administratora - Whitelista")) {
                if (e.getCurrentItem() == null) {
                    return;
                }


                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "§lWhitelist - ON")) {
                Bukkit.getServer().setWhitelist(true);
                for(Player player : Bukkit.getOnlinePlayers()) {
                    if(!player.isWhitelisted()) {
                        player.kickPlayer(ChatColor.RED + "Zostales wyrzucony z powodu: Whitelista zostala wlaczona");
                    }
                    }
                p.sendMessage(ChatColor.RED + "Pomyslnie wlaczyles whiteliste \n Wszyscy gracze ktorzy nie byli na whiteliscie zostali wyrzuceni z serwera");

                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "§lWhitelist - OFF")) {
                    Bukkit.getServer().setWhitelist(false);
                    p.sendMessage("Pomysnie wylaczyles whiteliste");

                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "§lWroc do panelu")) {
                    p.closeInventory();
                    p.openInventory(glownegui.glownyPanel());

                }
                e.setCancelled(true);
            }
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Panel Administratora - Difficulty")) {
            World world = Bukkit.getWorlds().get(0);
            if (e.getCurrentItem() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "§lTryb Gry - Pokojowy")) {
                world.setDifficulty(Difficulty.HARD);
                for(Player ps : Bukkit.getOnlinePlayers()) {
                    ps.sendMessage(ChatColor.BLUE + "Administrator " + ((Player) e.getWhoClicked()).getDisplayName() + " ustawil tryb gry na §7§lTrudny (Hard)");
                }
            }
        }
        }
    }

