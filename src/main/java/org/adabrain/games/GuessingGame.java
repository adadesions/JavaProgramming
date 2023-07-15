package org.adabrain.games;

import org.adabrain.games.abstracts.Game;
import org.adabrain.games.interfaces.Guessable;

public class GuessingGame extends Game implements Guessable {
    private int numberToGuess;
    private int maxGuesses;
    private int currentGuesses;

    public GuessingGame(int numberToGuess, int maxGuesses, int currentGuesses, String level) {
        super(level);
        this.numberToGuess = numberToGuess;
        this.maxGuesses = maxGuesses;
        this.currentGuesses = currentGuesses;
    }

    @Override
    public void play() {
        System.out.println("Game Start!");
    }

    @Override
    public void makeGuess(int guess) {

    }
}
