package me.komornik.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class glownegui {
    public static Inventory glownyPanel() {
        Inventory inventory1 = Bukkit.createInventory(null, 27, ChatColor.RED + "Panel Administratora");
        //czas gry (rano/wieczor)
        ItemStack time = new ItemStack(Material.SUNFLOWER, 1);
        ItemMeta TimeMeta = time.getItemMeta();
        TimeMeta.setDisplayName(ChatColor.YELLOW + "Czas Gry");


        ArrayList<String> lore1 = new ArrayList<>();
        lore1.add("Kliknij Prawym aby");
        lore1.add("Ustawic czas na serwerze");

        TimeMeta.setLore(lore1);
        time.setItemMeta(TimeMeta);
        // Pogoda
        ItemStack weather = new ItemStack(Material.WATER_BUCKET, 1);
        ItemMeta WeatherMeta = time.getItemMeta();
        WeatherMeta.setDisplayName(ChatColor.YELLOW + "Pogoda");


        ArrayList<String> weatherlore = new ArrayList<>();
        weatherlore.add("Kliknij Prawym aby");
        weatherlore.add("Zmienic pogode na serwerze");

        WeatherMeta.setLore(weatherlore);
        weather.setItemMeta(WeatherMeta);
        inventory1.setItem(10, time);
        inventory1.setItem(12, weather);

        return inventory1;
    }
}
