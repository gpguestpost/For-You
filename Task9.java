import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        double value1, value2;

        do {

            System.out.println("Enter + for Addition");
            System.out.println("Enter - for Subtraction");
            System.out.println("Enter * for Multiplication");
            System.out.println("Enter / for Division");
            System.out.println("Enter 4 to Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            if (choice == '4') {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the first number: ");
            value1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            value2 = scanner.nextDouble();

            switch (choice) {
                case '+':
                    System.out.println("Addition of " + value1 + " and " + value2 + " is: " + (value1 + value2));
                    break;
                case '-':
                    System.out.println("Subtraction of " + value1 + " and " + value2 + " is: " + (value1 - value2));
                    break;
                case '*':
                    System.out.println("Multiplication of " + value1 + " and " + value2 + " is: " + (value1 * value2));
                    break;
                case '/':
                    System.out.println("Division of " + value1 + " and " + value2 + " is: " + (value1 / value2));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (true);

        scanner.close();
    }
}

