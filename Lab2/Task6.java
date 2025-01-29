import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        int age = input.nextInt();

        System.out.println((age >= 18) ? "Eligible for voting" : "Not Eligible for Voting"); 

        input.close();
    }
}

