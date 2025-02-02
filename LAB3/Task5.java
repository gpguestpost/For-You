import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        String arr1[][] = {
            {"seat 1", "seat 2", "seat 3"},
            {"seat 4", "seat 5", "seat 6"},
            {"seat 6", "seat 8", "seat 9"}
        };

        boolean arr2[][] = {
            {false, false, false},
            {false, false, false},
            {false, false, false}
        };

        do {
            System.out.println("\n1/: See available seats");
            System.out.println("2/: Reserve a seat");
            System.out.println("3/: Exit");

            System.out.print("Enter your choice: ");
            int xyz = cin.nextInt();

            switch (xyz) {
                case 1:
                    System.out.println("\nAvailable Seats:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.println(arr1[i][j] + " (Row " + i + ", Column " + j + ") - " + (arr2[i][j]));
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("\nEnter the location of the seat (Row and Column: 0-2): ");
                    System.out.print("Row: ");
                    int row = cin.nextInt();
                    System.out.print("Column: ");
                    int col = cin.nextInt();

                    if (row > 2 || col > 2) {
                        System.out.println("\nInvalid Row or Column. Please try again.\n");
                        break;
                    }

                    if (!arr2[row][col]) {
                        arr2[row][col] = true;
                        System.out.println("\nYour " + arr1[row][col] + " is reserved now.\n");
                    } else {
                        System.out.println("\nThe " + arr1[row][col] + " is already reserved.\n");
                    }
                    break;

                case 3:
                    System.out.println("\nExiting... Goodbye!");
                    cin.close();
                    return;

                default:
                    System.out.println("\nInvalid Choice. Please select a valid option.\n");
                    break;
            }
        } while (true);
    }
}

// Developed by MEHRAN AND NISAR

