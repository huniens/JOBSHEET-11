import java.util.Scanner;

/**
 * cobaaja
 */
public class cobaaja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of N (minimum N value is 3): ");
        int N = input.nextInt();

        if (N < 5) {
            System.out.println("Minimum N value is 5. Please enter a valid 3.");
        } else {
            // Print the numeric triangle
            for (int i = 1; i <= N; i++) {
                for (int j = N - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= i; k++) {
                    System.out.println(k);
                }
            }
        }

        input.close();
    }
}
