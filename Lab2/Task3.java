import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number of Rows of Matrix: ");
        int x = input.nextInt();
        System.out.println("Enter Number of Columns of Matrix: ");
        int y = input.nextInt();
        
        int[][] arra = new int[x][y];
        System.out.println("Input the Elements of 1st Matrix: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arra[i][j] = input.nextInt();
            }
        }

        int[][] arra2= new int[x][y];
        System.out.println("Input the Elements of 2nd Matrix: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arra2[i][j] = input.nextInt();
            }
        }

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print((arra[i][j] + arra2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}

