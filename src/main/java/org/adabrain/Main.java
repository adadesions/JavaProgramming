package org.adabrain;

import org.adabrain.games.GuessingGame;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        GuessingGame game = new GuessingGame(random.nextInt(100), 10, -1, "easy");
        game.play();
    }
}