import java.util.Scanner;

/**
 * NumericTriangle13
 */
public class NumericTriangle13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for N (minimum value is 3)
        System.out.print("Enter the value of N (minimum 3): ");
        int N = scanner.nextInt();

        // Check if N is at least 3
        if (N < 3) {
            System.out.println("Minimum value of N is 3. Exiting program.");
            return;
        }

        // Print Numeric Triangle
        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
