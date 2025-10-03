import java.util.Random;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        Random random = new Random();
        Random randomSeed = new Random(3434);
        
        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        double x = random.nextDouble();
        double y = randomSeed.nextDouble();
        
        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        System.out.print("Unseeded Random: ");
        System.out.printf("%.2f%%", x*100);
        System.out.println();

        System.out.print("Seeded Random: ");
        System.out.printf("%.2f%%", y*100);

        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
    }
}