import java.util.Scanner; 
class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius, height;

        System.out.print("Enter value for Radius: ");
        radius = scanner.nextDouble();

        System.out.print("Enter value for Height: ");
        height = scanner.nextDouble();

        double pie = 3.14159;
        double squaredRadius = radius * radius; // Use a new variable for clarity
        double volumeOfCylinder = squaredRadius * pie * height;

        System.out.println("The Volume of the cylinder (using the formula): " + volumeOfCylinder);
        scanner.close(); 
    }
}

