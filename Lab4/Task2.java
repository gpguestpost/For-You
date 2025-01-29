import java.util.Scanner;

public class Task2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Text: ");
        String text = input.nextLine(); 
        
        String rev = "";
        
        for (int i = text.length()-1; i>=0; i--){
            rev = rev + text.charAt(i);
        }
        if (rev.equals(text)){
          System.out.print("Palidrome");
        }
        else {
          System.out.print("Not Palidrome ");
        }
        
        
        
   }
}
