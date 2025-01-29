import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[6];
        System.out.println("Enter 6 Array Elements: ");

        arr[0] = input.nextInt();
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = input.nextInt();
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest Number from array: " + smallest);
        System.out.println("Largest Number from array: " + largest);

        if (largest % 2 == 0) {
            System.out.println("Largest number " + largest + " is divisible by 2.");
        } else {
            System.out.println("Largest number " + largest + " is not divisible by 2.");
        }

        input.close();
    }
}

