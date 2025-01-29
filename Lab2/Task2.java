import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arra = new int[10];
        int count = 0, sum = 0;

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arra.length; i++) {
            arra[i] = scanner.nextInt();
        }

        System.out.println("Array Elements:");
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + " ");
        }

        for (int i = 0; i < arra.length; i++) {
            if (arra[i] % 4 == 0) {
                count++;
                sum += arra[i];
            }
        }

        System.out.println("\nTotal " + count + " time(s) detected multiple of 4 in array");
        System.out.println("Sum = " + sum);
        System.out.println();

        scanner.close(); 
    }
}

