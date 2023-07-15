package org.adabrain.games;

import org.adabrain.games.abstracts.Game;
import org.adabrain.games.interfaces.Guessable;

import java.util.Scanner;

public class GuessingGame extends Game implements Guessable {
    private int numberToGuess;
    private int maxGuesses;
    private int currentGuesses;
    private boolean isGuessRightAnswer = false;

    public GuessingGame(int numberToGuess, int maxGuesses, int currentGuesses, String level) {
        super(level);
        this.numberToGuess = numberToGuess;
        this.maxGuesses = maxGuesses;
        this.currentGuesses = currentGuesses;
    }

    @Override
    public void play() {
        System.out.println("Game Start!");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < this.maxGuesses; i++) {
            System.out.println("Enter a guess number: ");
            this.currentGuesses = scanner.nextInt();

            if (this.currentGuesses == this.numberToGuess) {
                isGuessRightAnswer = true;
                break;
            }
            // Feedback to player
            else if (this.currentGuesses > this.numberToGuess) {
                System.out.println("AI: Lower!");
            }
            else
            {
                System.out.println("AI: Higher!");
            }

            System.out.println("Next Guess...");
        }

        if (isGuessRightAnswer) {
            System.out.println("Yuuuuhooooo! Yeahhh, You won!");
        }
        else {
            System.out.println("Game Over");
        }

    }

    @Override
    public void makeGuess(int guess) {

    }
}
