package de.npc.smellyaura;

import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import java.util.Random;

public class Aura implements Listener {

    public static Vector generateRandomVelocity() {
        Random random = new Random();

        double x = -1 + (2 * random.nextDouble());
        double y = 0.5 + (random.nextDouble());
        double z = -1 + (2 * random.nextDouble());

        return new Vector(x, y, z);
    }

    @EventHandler
    public void smellyAura(PlayerMoveEvent event){
        Player player = event.getPlayer();
        Random random = new Random();
        float rFloat = 1.0f + random.nextFloat();

        for (Entity e : player.getNearbyEntities(5, 5, 5)){
            if (!(e instanceof Player player1)){
                e.setVelocity(generateRandomVelocity());
                player.playSound(player.getLocation(), Sound.ENTITY_MULE_CHEST, 1F, rFloat);
            }
        }
    }
}
