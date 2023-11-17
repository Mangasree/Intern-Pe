import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int numberOfTries = 0;
        int playerGuess = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        
        while (playerGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            playerGuess = scanner.nextInt();
            numberOfTries++;
            
            if (playerGuess < lowerBound || playerGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
            } else if (playerGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            }
        }
        
        System.out.println("That's Cool! You guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
        
        scanner.close();
    }
}
