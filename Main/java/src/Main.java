import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of AreaMeasurable
        ArrayList<AreaMeasurable> areaMeasurables = new ArrayList<>();

        // Populate the list with random instances of AreaMeasurable classes
        for (int i = 0; i < 5; i++) {
            areaMeasurables.add(createRandomShape());
        }

        // Call the calculateSum() method and print the result
        double sum = calculateSum(areaMeasurables);
        System.out.println("Total area: " + sum);
    }

    // Method to create a random double
    private static double nextRandomDouble() {
        Random random = new Random();
        return random.nextDouble() * 10; // Adjust the range as needed
    }

    // Method to calculate the sum of areas in the list
    private static double calculateSum(ArrayList<AreaMeasurable> shapes) {
        double sum = 0;
        for (AreaMeasurable shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }

    // Method to create a random shape
    private static AreaMeasurable createRandomShape() {
        Random random = new Random();
        int choice = random.nextInt(5); // Adjust based on the number of AreaMeasurable classes

        switch (choice) {
            case 0:
                return new Circle(nextRandomDouble());
            case 1:
                return new Rectangle(nextRandomDouble(), nextRandomDouble());
            case 2:
                return new Square(nextRandomDouble());
            case 3:
                return new Sphere(nextRandomDouble());
            case 4:
                return new Box(nextRandomDouble(), nextRandomDouble(), nextRandomDouble());
            default:
                return new Circle(nextRandomDouble()); // Default to Circle
        }
    }
}