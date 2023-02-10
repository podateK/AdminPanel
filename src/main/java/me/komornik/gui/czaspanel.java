package me.komornik.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class czaspanel {

        public static Inventory CzasPanel() {
            Inventory inventory2 = Bukkit.createInventory(null, 27, ChatColor.RED + "Panel Administratora - Czas");
            //dzien
            ItemStack time1 = new ItemStack(Material.YELLOW_CONCRETE, 1);
            ItemMeta Time1Meta = time1.getItemMeta();
            Time1Meta.setDisplayName(ChatColor.YELLOW + "Dzien");


            ArrayList<String> lore2 = new ArrayList<>();
            lore2.add("Kliknij Prawym aby");
            lore2.add("Ustawic sloneczna pore dnia na serwerze");

            Time1Meta.setLore(lore2);
            time1.setItemMeta(Time1Meta);

            //noc

            ItemStack time2 = new ItemStack(Material.BLACK_CONCRETE, 1);
            ItemMeta Time2Meta = time1.getItemMeta();
            Time2Meta.setDisplayName(ChatColor.YELLOW + "Noc");


            ArrayList<String> lore3 = new ArrayList<>();
            lore3.add("Kliknij Prawym aby");
            lore3.add("Ustawic nocna pore dnia na serwerze");

            Time2Meta.setLore(lore3);
            time2.setItemMeta(Time2Meta);

            //wracanie

            ItemStack wracanie = new ItemStack(Material.BARRIER, 1);
            ItemMeta wracanieMeta = wracanie.getItemMeta();
            wracanieMeta.setDisplayName(ChatColor.BLUE + "Wroc do panelu");


            ArrayList<String> wracanielore = new ArrayList<>();
            wracanielore.add("Kliknij Prawym aby");
            wracanielore.add("Aby wrocic do menu glownego panelu");

            wracanieMeta.setLore(wracanielore);
            wracanie.setItemMeta(wracanieMeta);

            inventory2.setItem(12, time1);
            inventory2.setItem(14, time2);
            inventory2.setItem(26, wracanie);

            return inventory2;
        }
    }
