package me.sdkssh.darksaouls;

import me.sdkssh.darksaouls.events.DeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public class DarkSaoul extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DeathListener(), this);
        super.onEnable();
    }
}
