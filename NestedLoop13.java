import java.util.Scanner;

/**
 * NestedLoop13
 */
public class NestedLoop13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        double[][] temps = new double[5][7];

         // Input temperatures for each city and day
         for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = input13.nextDouble();
            }
            System.out.println();
        }

        // Display temperatures and calculate average for each city
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            double cityTotal = 0; // Variable to store the sum of temperatures for the city

            // Display temperatures for each day and calculate the sum
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                cityTotal += temps[i][j];
            }

            // Calculate and display the average for the city
            double cityAverage = cityTotal / temps[0].length;
            System.out.println("\nAverage Temperature: " + cityAverage);
            System.out.println();
        }
    }
}