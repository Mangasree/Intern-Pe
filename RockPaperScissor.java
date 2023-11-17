import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        String[] choices = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Let's play Rock, Paper, Scissors!");
        
        while (true) {
            System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
            String playerChoice = input.next();
            
            int randIndex = rand.nextInt(3);
            String computerChoice = choices[randIndex];
            
            System.out.println("Computer chose: " + computerChoice);
            
            if (playerChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                       (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper")) ||
                       (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))) {
                System.out.println("Congrats you win!");
            } else {
                System.out.println("Computer wins!");
            }
            
            System.out.print("Wanna play again? (yes/no): ");
            String playAgain = input.next();
            
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
        }
        
        input.close();
    }
}
