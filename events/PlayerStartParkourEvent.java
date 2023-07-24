package com.person98.lobbyparkourapi.events;
// person89: I added this import

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Represents an event that is called when a player starts a parkour course.
 */
public class PlayerStartParkourEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();

    private Player player;

    /**
     * Creates a new PlayerStartParkourEvent.
     *
     * @param player the player who started the parkour course
     */
    public PlayerStartParkourEvent(Player player) {
        this.player = player;
    }

    /**
     * Returns the player who started the parkour course.
     *
     * @return the player
     */

    public Player getPlayer() {
        return player;
    }


    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
