package org.adabrain.games.abstracts;

public abstract class Game {
    // level: The level of the game (integer).
    private String level;

    // Constructor: Takes the level as a parameter and initializes the property.
    protected Game(String level) {
        this.level = level;
    }

    // Todo: Abstract method: void play(), which starts the game.
    public abstract void play();
}
