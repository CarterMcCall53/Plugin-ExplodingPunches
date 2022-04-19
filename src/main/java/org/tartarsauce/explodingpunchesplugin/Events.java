package org.tartarsauce.explodingpunchesplugin;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.util.Vector;

public class Events implements Listener {
    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent e) {

        var attacker = e.getDamager().getType();
        if (attacker == EntityType.PLAYER) {
            var loc = e.getEntity().getLocation();
           e.getEntity().getWorld().createExplosion(loc, 1f);
            var knockback = e.getDamager().getLocation().getDirection();
            knockback = knockback.normalize().add(new Vector(0, 1, 0)).multiply(5);
            e.getEntity().setVelocity(knockback);
            //e.getEntity().setGravity(!e.getEntity().hasGravity());
        }
    }
}

