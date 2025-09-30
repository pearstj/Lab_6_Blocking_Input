import java.util.Scanner;

class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        String trash = "";
        boolean done = false;

        // Input loop for Celsius temperature
        do {
            System.out.print("Enter temperature in Celsius: ");

            if(in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // clear the newline from buffer
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid number!");
            }
        } while(!done);

        // Convert Celsius to Fahrenheit: F = (C * 9/5) + 32
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        // Display result
        System.out.println("\n" + celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit");

        in.close();
    }
}