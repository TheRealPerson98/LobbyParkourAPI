package com.person98.lobbyparkourapi.events;
// person89: I added this import
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Represents an event that is called when a player reaches a checkpoint in a parkour course.
 */
public class PlayerCheckpointParkourEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();

    private Player player;
    private int checkpointNumber;

    /**
     * Creates a new PlayerCheckpointParkourEvent.
     *
     * @param player the player who reached the checkpoint
     * @param checkpointNumber the number of the checkpoint that was reached
     */
    public PlayerCheckpointParkourEvent(Player player, int checkpointNumber) {
        this.player = player;
        this.checkpointNumber = checkpointNumber;
    }
    /**
     * Returns the player who reached the checkpoint.
     *
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }
    /**
     * Returns the number of the checkpoint that was reached.
     *
     * @return the checkpoint number
     */
    public int getCheckpointNumber() {
        return checkpointNumber;
    }
    /**
     * Gets the HandlerList for this event.
     *
     * @return the HandlerList
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * Gets the static HandlerList for this event.
     *
     * @return the HandlerList
     */
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
