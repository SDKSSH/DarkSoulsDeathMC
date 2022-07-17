package me.sdkssh.darksaouls.events;

import me.sdkssh.darksaouls.title.NMSTitle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DeathListener implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        e.getEntity().spigot().respawn();
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent e){
        Player p = e.getPlayer();
        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 25));
        NMSTitle.sendTitle(p, "§cYOU'RE DEAD !", 40, 60, 40);
    }
}
