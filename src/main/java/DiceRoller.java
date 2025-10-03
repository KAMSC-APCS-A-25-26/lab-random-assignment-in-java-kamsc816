import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        // 2. One Random object with any seed value (seeded die)
        Random r = new Random();
        Random seeded = new Random(4141);

        // TODO: Generate random integers for dice rolls
        System.out.println("Unseeded Die 1: " + ((r.nextInt(6)+1)));
        System.out.println("Unseeded Die 2: " + ((r.nextInt(6)+1)));
        System.out.println("Unseeded Die 3: " + ((r.nextInt(6)+1)));
        System.out.print("Seeded Die: "+ ((seeded.nextInt(6)+1)));
        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        
        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
    }
}
