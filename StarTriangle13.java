import java.util.Scanner;
/**
 * StarTriangle13
 */
public class StarTriangle13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        // Input for N (minimum value is 5)
        System.out.print("Enter the value of N (minimum 5): ");
        int N = input13.nextInt();

        // Check if N is at least 5
        if (N < 5) {
            System.out.println("Minimum value of N is 5. Exiting program.");
            return;
        }

        // Print Star Triangle
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input13.close();
    }
}
