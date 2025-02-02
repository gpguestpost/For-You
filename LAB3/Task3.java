import java.util.Scanner;

public class Task3 {
    public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      
      int[][] arra = { {12, 13, 15, 16}, {11, 110, 121, 17}, {17, 18, 100, 21} };
      int sum=0;

      for (int i = 0; i < 3; i++) { 
        for (int j = 0; j < 4; j++) {
          System.out.print(arra[i][j] + " ");
        }
        System.out.println();
      }
      
      System.out.println("\nDivided even number from the matrix by 2 \n");
      
      for (int i = 0; i < 3; i++) { 
        for (int j = 0; j < 4; j++) {
          if (arra[i][j] % 2 == 0){
             arra[i][j] = arra[i][j]  / 2 ; 
             sum = sum + arra[i][j];
          }
          System.out.print(arra[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println("\nOdd Number from Matrix \n");
      for (int i = 0; i < 3; i++) { 
        for (int j = 0; j < 4; j++) {
          if (arra[i][j] % 2 != 0){
            System.out.print(arra[i][j] + " ");
          }
        }
        System.out.println();
      }
      System.out.println("\nSum of Even numbers: " + sum);
    }
}

