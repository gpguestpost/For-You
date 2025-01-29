public class Task4 {
    public static void main(String[] args) {
        

        int[] arra = {1, 4, 9, 16, 25, 36, 49, 64, 81, 0};
        

        System.out.print("Array: ");
        for (int j = 0; j < arra.length; j++) {
            System.out.print(arra[j] + " ");
        }
        
        System.out.print("\nPrinting Odd Numbers: \n");
        

        int sum = 0;
        int i = 0;
        
        while (i < arra.length) {
            if (arra[i] == 81) {  // Break the loop when 81 is reached
                break;
            }
            
            if (arra[i] % 2 != 0) {  // Add sum of Odd numbers
                sum = sum + arra[i];
            }
            
            i++;
        }
        
        System.out.println("Sum of odd numbers: " + sum + "\n");
    }
}

