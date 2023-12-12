import java.util.Scanner;

/**
 * Atheletes13
 */
public class Atheletes13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        // Number of sports and athletes per sport
        int numSports = 4; // Assuming four sports: badminton, table tennis, basketball, volleyball
        int numAthletesPerSport = 5;

        // 2D array to store athlete names
        String[][] athletes = new String[numSports][numAthletesPerSport];

        // Input athlete names
        for (int i = 0; i < numSports; i++) {
            System.out.println("Enter the names of athletes for " + getSportName(i) + ":");
            for (int j = 0; j < numAthletesPerSport; j++) {
                System.out.print("Athlete " + (j + 1) + ": ");
                athletes[i][j] = input13.nextLine();
            }
            System.out.println();
        }

        // Display athlete names in ascending order
        System.out.println("List of Athletes in Ascending Order:");
        for (int i = 0; i < numSports; i++) {
            System.out.println("Athletes for " + getSportName(i) + ":");
            for (int j = 0; j < numAthletesPerSport; j++) {
                System.out.println("  " + athletes[i][j]);
            }
            System.out.println();
        }

        input13.close();
    }

    // Helper method to get the sport name based on the index
    private static String getSportName(int index) {
        switch (index) {
            case 0:
                return "Badminton";
            case 1:
                return "Table Tennis";
            case 2:
                return "Basketball";
            case 3:
                return "Volleyball";
            default:
                return "Unknown Sport";
        }
    }
}
