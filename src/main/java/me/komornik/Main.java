package me.komornik;

import me.komornik.commands.KomendaMenu;
import me.komornik.listeners.MenuListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic


        getCommand("panel").setExecutor(new KomendaMenu());
        Bukkit.getPluginManager().registerEvents(new MenuListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
