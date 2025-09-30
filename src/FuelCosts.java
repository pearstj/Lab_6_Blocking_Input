import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean done = false;

        // Input loop for gallons in tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");

            if(in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine(); // clear the newline from buffer
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid number!");
            }
        } while(!done);

        // Reset done for next input
        done = false;

        // Input loop for fuel efficiency (MPG)
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            if(in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine(); // clear the newline from buffer
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid number!");
            }
        } while(!done);

        // Reset done for next input
        done = false;

        // Input loop for price per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");

            if(in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // clear the newline from buffer
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid number!");
            }
        } while(!done);

        // Calculate cost to drive 100 miles
        double gallonsFor100Miles = 100.0 / mpg;
        double costFor100Miles = gallonsFor100Miles * pricePerGallon;

        // Calculate distance with full tank
        double distanceWithFullTank = gallons * mpg;

        // Display results
        System.out.println("\n--- Results ---");
        System.out.printf("Cost to drive 100 miles: $%.2f\n", costFor100Miles);
        System.out.printf("Distance with full tank: %.2f miles\n", distanceWithFullTank);

        in.close();
    }
}