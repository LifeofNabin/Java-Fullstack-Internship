import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Switch states
        boolean light1 = false;
        boolean light2 = false;
        boolean fan = false;
        boolean motor = false;

        System.out.println("Switchboard Control:");
        System.out.println("Enter 1 - Toggle Light Switch 1");
        System.out.println("Enter 2 - Toggle Light Switch 2");
        System.out.println("Enter 3 - Toggle Fan");
        System.out.println("Enter 4 - Toggle Motor");
        System.out.println("Enter 0 - Exit");

        while (true) {
            System.out.print("\nEnter your choice: ");
            int num = s.nextInt();

            if (num == 0) break; // Exit the loop

            switch (num) {
                case 1:
                    light1 = !light1;          // toggle switch1
                    if (light1) light2 = false; // mutual exclusion
                    break;
                case 2:
                    light2 = !light2;          
                    if (light2) light1 = false; // mutual exclusion
                    break;
                case 3:
                    fan = !fan; // toggle fan
                    break;
                case 4:
                    motor = !motor; // toggle motor
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            // Print current status
            System.out.println("\n--- Current Status ---");
            System.out.println("Light Switch1: " + (light1 ? "ON" : "OFF"));
            System.out.println("Light Switch2: " + (light2 ? "ON" : "OFF"));
            System.out.println("Fan: " + (fan ? "ON" : "OFF"));
            System.out.println("Motor: " + (motor ? "ON" : "OFF"));

            System.out.println("\nDevices:");
            System.out.println("Light is " + ((light1 || light2) ? "ON" : "OFF"));
            System.out.println("Fan is " + (fan ? "ON" : "OFF"));
            System.out.println("Motor is " + (motor ? "ON" : "OFF"));
            System.out.println("----------------------");
        }

        s.close();
        System.out.println("Switchboard closed.");
    }
}
