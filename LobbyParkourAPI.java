package com.person98.lobbyparkourapi;
// person89: I added this import

import java.util.List;
import java.util.Map;

public interface LobbyParkourAPI {

    /**
     * Returns a map of hologram texts for the specified parkour course.
     *
     * @param parkourName the name of the parkour course
     * @return map of hologram texts
     */
    public Map<String, String> getHologramTexts(String parkourName);

    /**
     * Returns a list of all parkour courses.
     *
     * @return list of parkour courses
     */
    public List<String> getAllCourses();

    /**
     * Returns a map of player times for the specified parkour course.
     *
     * @param courseName the name of the parkour course
     * @return map of player times
     */

    Map<String, Long> getParkourTimes(String courseName); // The new method

    /**
     * Resets the times for all players on the specified parkour course.
     *
     * @param courseName the name of the parkour course
     */

    void resetPlayerTimes(String courseName);

    /**
     * Resets the time for a specific player on the specified parkour course.
     *
     * @param courseName the name of the parkour course
     * @param playerName the name of the player
     */

    void resetplayertime(String courseName, String playerName);

    /**
     * Sets the time for a specific player on the specified parkour course.
     *
     * @param courseName the name of the parkour course
     * @param playerName the name of the player
     * @param time the time to set for the player
     */

    void setPlayerTime(String courseName, String playerName, long time);

    /**
     * Reloads leaderboard holograms.
     */

    void reloadHologramConfigs();

    /**
     * Loads a parkour course.
     *
     * @param courseName the name of the parkour course
     */

    void loadParkourCourse(String courseName);

    /**
     * Loads all parkour courses.
     */

    void loadParkourAllCorses();

    /**
     *  Enables a parkour course.
     * @param courseName
     */

    void enableParkourCourse(String courseName);

    /**
     * Disables a parkour course.
     * @param courseName
     */
    void disableParkourCourse(String courseName);
}
