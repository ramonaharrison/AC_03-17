package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Hangman.java
 */

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        int misses = 0;
        String alreadyGuessed = "";
        Scanner input = new Scanner(System.in);
        Drawing drawing = new Drawing();
        SecretWord secretWord = new SecretWord();

        System.out.println("Let's play Hangman!");

        while (true) {
            System.out.println("Word: " + secretWord.toString());
            System.out.println(drawing.get(misses));
            System.out.println("Misses: " + misses);
            System.out.print("Guess: ");
            char guess = input.next().charAt(0);

            //Character caseCheck = new Character(guess);
            if(Character.isLowerCase(guess)){
                System.err.println("Please only use uppercase letters");
                continue;
            }

            if(alreadyGuessed.contains("" + guess)){
                System.err.println("You've already guessed that letter!");
                continue;
            }

            alreadyGuessed += guess;

            if (secretWord.isLetter(guess)) {
                secretWord.set(guess);
            } else {
                misses += 1;
            }

            if (misses > 5) {
                System.out.println(drawing.get(misses));
                System.out.println("Out of turns!");
                System.out.println("The word was: " + secretWord.reveal());
                break;
            }

            if (secretWord.isGuessed()) {
                System.out.println("You won!");
                System.out.println("The word was: " + secretWord.reveal());
                break;
            }

        }

    }
}