package no.dirik.GeneralStuff;

import org.bukkit.entity.*;

import java.util.ArrayList;

/**
 * @author Jakob Holkestad Molnes
 *
 *        This class is used to get all tamed entities in a 10x10x10 area.
 */
public class GetTamedEntities {
    Player player;

    /**
     * Sets the player.
     * @param player the player to set.
     */
    public GetTamedEntities(Player player) {
        this.player = player;

    }

    /**
     * @return an ArrayList of all tamed entities in a 10x10x10 area.
     *
     */
    public ArrayList<Entity> getTamedEntities() {
        ArrayList<Entity> entities = new ArrayList<Entity>();
        for (Entity entity : this.player.getNearbyEntities(10, 10, 10)) {
            if (isTamed(entity) && getOwner(entity).getUniqueId().equals(this.player.getUniqueId())) {
                entities.add(entity);
            }
        }
        return entities;
    }

    /**
     *
     * @param entity
     * @return true if the entity is a tamed entity.
     */
    private boolean isTamed(Entity entity){
        return entity instanceof Tameable && ((Tameable) entity).isTamed();
    }

    /**
     *
     * @param entity
     * @return the owner of the entity.
     */
    private AnimalTamer getOwner(Entity entity){
        return ((Tameable) entity).getOwner();
    }
}
