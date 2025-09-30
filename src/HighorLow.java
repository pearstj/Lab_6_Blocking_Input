import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        // Generate random number between 1 and 10 inclusive
        int randomNumber = generator.nextInt(10) + 1;

        int guess = 0;
        String trash = "";
        boolean done = false;

        // Input loop for user's guess
        do {
            System.out.print("Guess a number between 1 and 10: ");

            if(in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine(); // clear the newline from buffer

                // Validate that guess is within range
                if(guess >= 1 && guess <= 10) {
                    done = true;
                }
                else {
                    System.out.println("\nYour guess must be between 1 and 10!");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid integer!");
            }
        } while(!done);

        // Display the random number
        System.out.println("\nThe random number was: " + randomNumber);
        System.out.println("Your guess was: " + guess);

        // Compare and display result
        if(guess == randomNumber) {
            System.out.println("On the money! You guessed correctly!");
        }
        else if(guess < randomNumber) {
            System.out.println("Your guess was too low!");
        }
        else {
            System.out.println("Your guess was too high!");
        }

        in.close();
    }
}