import java.util.*;

public class GuessArray {
    public static void main(String[] args) {
        
        // CREATE array of numbers
        int[] numbers = {3, 7, 15, 24, 31, 45, 52, 68, 73, 89};
        
        // PICK random number from array
        Random random = new Random();
        int randomIndex = random.nextInt(numbers.length);
        int secretNumber = numbers[randomIndex];
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("=== GUESS NUMBER FROM ARRAY ===");
        System.out.println("Possible numbers: " + Arrays.toString(numbers));
        System.out.println("I picked one. Try to guess it!\n");
        
        int attempts = 0;
        
        while (true) {
            System.out.print("Guess: ");
            int guess = s.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                System.out.println("\n✅ YES! It was " + secretNumber);
                System.out.println("Attempts: " + attempts);
                break;
            }
            else {
                // Check if guess is in array
                boolean found = false;
                for (int num : numbers) {
                    if (num == guess) {
                        found = true;
                        break;
                    }
                }
                
                if (found) {
                    System.out.println("❌ Wrong number from list. Try another!\n");
                } else {
                    System.out.println("❌ That number is not in the list!\n");
                }
            }
        }
        
        s.close();
    }
}