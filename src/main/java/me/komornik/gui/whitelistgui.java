package me.komornik.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

import static org.bukkit.ChatColor.BOLD;

public class whitelistgui {
    public static Inventory whitelistPanel() {
        Inventory inventory5 = Bukkit.createInventory(null, 27, ChatColor.RED + "Panel administratora - Whitelista");
        //whitelist on
        ItemStack whiteliston = new ItemStack(Material.PAPER, 1);
        ItemMeta whitelistonMeta = whiteliston.getItemMeta();
        whitelistonMeta.setDisplayName(ChatColor.BLUE + "§lWhitelist - ON");


        ArrayList<String> lore5 = new ArrayList<>();
        lore5.add(ChatColor.YELLOW + "Kliknij Prawym aby");
        lore5.add(ChatColor.YELLOW +  "Wlaczyc whiteliste");

        whitelistonMeta.setLore(lore5);
        whiteliston.setItemMeta(whitelistonMeta);

        //whitelist off
        ItemStack whitelistoff = new ItemStack(Material.PAPER, 1);
        ItemMeta whitelistoffMeta = whitelistoff.getItemMeta();
        whitelistoffMeta.setDisplayName(ChatColor.BLUE + "§lWhitelist - OFF");


        ArrayList<String> lore6 = new ArrayList<>();
        lore6.add(ChatColor.YELLOW +  "Kliknij Prawym aby");
        lore6.add(ChatColor.YELLOW +  "Wylaczyc whiteliste");

        whitelistoffMeta.setLore(lore6);
        whitelistoff.setItemMeta(whitelistoffMeta);

//exit button
        ItemStack wracanie = new ItemStack(Material.BARRIER, 1);
        ItemMeta wracanieMeta = wracanie.getItemMeta();
        wracanieMeta.setDisplayName(ChatColor.BLUE + "§lWroc do panelu");


        ArrayList<String> wracanielore = new ArrayList<>();
        wracanielore.add(ChatColor.YELLOW + "Kliknij prawym");
        wracanielore.add(ChatColor.YELLOW + "Aby wrocic do menu glownego panelu");

        wracanieMeta.setLore(wracanielore);
        wracanie.setItemMeta(wracanieMeta);

        inventory5.setItem(12, whiteliston);
        inventory5.setItem(14, whitelistoff);
        inventory5.setItem(26, wracanie);

     return inventory5;
    }
}
