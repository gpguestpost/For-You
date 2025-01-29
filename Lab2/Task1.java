import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] const_arr = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 't', 'v', 'w', 'x', 'y', 'z'};

        System.out.print("Enter Consonant: ");
        char user_input = scanner.next().charAt(0);

        boolean check = false;
        for (int i = 0; i < const_arr.length; i++) {
            if (user_input == const_arr[i]) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println("Consonant");
        } else {
            System.out.println("Not a Consonant");
        }

        scanner.close();
    }
}

