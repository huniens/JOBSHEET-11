import java.util.Scanner;
import java.util.Random;
/**
 * Quiz13
 */
public class Quiz13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Gues the number (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);  
            } while (!success);
            System.out.print("Do you want to repeat the game (Y/N)");
            menu = input.next().charAt(0);
            input.nextLine();

            if (menu != 'Y' && menu != 'y') {
                break;
            }
        } while (menu == 'Y' || menu == 'y');
    }
}