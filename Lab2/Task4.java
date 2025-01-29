import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] arrayNames = new String[6];
        String findName = "Ali";
        boolean isFound = false;

        System.out.println("Enter 6 names: ");
        for (int i = 0; i < arrayNames.length; i++) {
            arrayNames[i] = input.nextLine();
        }

        for (int i = 0; i < arrayNames.length; i++) {
            if (arrayNames[i].equalsIgnoreCase(findName)) {
                isFound = true;
                break; 
            }
        }

        if (isFound) {
            System.out.println("Ali is present in the array.");
        } else {
            System.out.println("Ali is not present in the array.");
        }

        input.close();
    }
}

