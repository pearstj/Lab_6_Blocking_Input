import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        String trash = "";
        boolean done = false;

        // Input loop for width
        do {
            System.out.print("Enter the width of the rectangle: ");

            if(in.hasNextDouble()) {
                width = in.nextDouble();
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

        // Input loop for height
        do {
            System.out.print("Enter the height of the rectangle: ");

            if(in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine(); // clear the newline from buffer
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid number!");
            }
        } while(!done);

        // Calculate area, perimeter, and diagonal
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        // Display results
        System.out.println("\n--- Rectangle Information ---");
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);

        in.close();
    }
}