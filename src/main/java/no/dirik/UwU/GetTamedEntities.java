package no.dirik.UwU;

import org.bukkit.entity.*;

import java.util.ArrayList;

public class GetTamedEntities {
    Player player;
    public GetTamedEntities(Player player) {
        this.player = player;

    }

    public ArrayList<Entity> getTamedEntities() {
        ArrayList<Entity> entities = new ArrayList<Entity>();
        for (Entity entity : this.player.getNearbyEntities(10, 10, 10)) {
            if (isTamed(entity) && getOwner(entity).getUniqueId().equals(this.player.getUniqueId())) {
                entities.add(entity);
            }
        }
        return entities;
    }

    private boolean isTamed(Entity entity){
        return entity instanceof Tameable && ((Tameable) entity).isTamed();
    }
    private AnimalTamer getOwner(Entity entity){
        return ((Tameable) entity).getOwner();
    }
}
