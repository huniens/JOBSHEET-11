import java.util.Scanner;

/**
 * Triangle13
 */
public class Triangle13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = input13.nextInt();
        
        int i = 1;
        while (i <= N) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}