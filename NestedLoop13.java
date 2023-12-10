import java.util.Scanner;

/**
 * NestedLoop13
 */
public class NestedLoop13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1)+": ");
                temps[i][j] = input13.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (double temperature : temps[i]) {
                System.out.print(temperature + " ");
            }
            System.out.println();
        }
    }
}