import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Starting Number: ");
        int start = scanner.nextInt();   //user input for starting point
        
        System.out.print("Enter Ending Number: ");
        int end = scanner.nextInt();    //user input for ending point

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

