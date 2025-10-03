import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        Random random = new Random();
        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        int x = random.nextInt(8);
        int y = random.nextInt(8);
        int z = random.nextInt(8);

        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        int a = random.nextInt(743);
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        int b = random.nextInt(1000);
        
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
        String realA = String.format("%03d", a);
        String realB = String.format("%03d", b);
        System.out.println(x+""+y+""+z+"-"+realA+"-"+realB);
    }
}
