import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
        double speedInMph;
        System.out.print("Enter Speed in Miles per hour: ");
        double speedInKph = speedInMph * 1.60934;
        System.out.println("Converted speed in kilometers per hour: " + speedInKph);
    }
}

