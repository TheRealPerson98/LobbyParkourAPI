package com.person98.lobbyparkourapi.events;
// person89: I added this import

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Represents an event that is called when a player finishes a parkour course.
 */
public class PlayerFinishParkourEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private Player player;
    private long finishTime;

    /**
     * Creates a new PlayerFinishParkourEvent.
     *
     * @param player the player who finished the parkour course
     * @param finishTime the time it took the player to finish the parkour course
     */
    public PlayerFinishParkourEvent(Player player, long finishTime) {
        this.player = player;
        this.finishTime = finishTime;
    }

    /**
     * Returns the player who finished the parkour course.
     *
     * @return the player
     */

    public Player getPlayer() {
        return player;
    }

    /**
     * Returns the time it took the player to finish the parkour course.
     * in milliseconds
     * @return the finish time
     */

    public long getFinishTime() {
        return finishTime;
    }


    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
