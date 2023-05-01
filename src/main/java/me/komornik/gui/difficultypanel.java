package me.komornik.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class difficultypanel {
    public static Inventory diffPanel() {
        Inventory inventory7 = Bukkit.createInventory(null, 27, ChatColor.RED + "Panel Administratora - Difficulty");
        ItemStack peacefull = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta peacMeta = peacefull.getItemMeta();
        peacMeta.setDisplayName(ChatColor.BLUE + "§lTryb Gry - Pokojowy");

        ArrayList<String> lore10 = new ArrayList<>();
        lore10.add(ChatColor.YELLOW + "Kliknij prawym aby");
        lore10.add(ChatColor.YELLOW + "Ustawic tryb gry na pokojowy");

        peacMeta.setLore(lore10);
        peacefull.setItemMeta(peacMeta);

        inventory7.setItem(12, peacefull);
        return inventory7;
    }
}
