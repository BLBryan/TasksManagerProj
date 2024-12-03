// import necessary utils
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // "running" state while active, will be toggled on/off
        boolean running = true;

        // Create scanner outside of loop to avoid repeat creation
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the To-Do App!");

        // Running the app
        while (running) {
            // Menu
            System.out.println("\nMenu:");
            System.out.println("1. Create New Task");
            System.out.println("2. View Existing Tasks");
            System.out.println("3. Edit Task");
            System.out.println("4. Delete");
            System.out.println("5. Turn off program");
            System.out.print("\nChoose an option: ");

            // get user input as int
            int choice = scanner.nextInt();

            // Create
            if (choice == 1) {
                System.out.println("Please enter the name of the new task: ");
                String taskName = scanner.nextLine();
                System.out.println("Task: " + taskName + " was successfully created!");
            }

            // Read
            else if (choice == 2) {
                System.out.println("BOOBOO");
            }

            // Update
            else if (choice == 3) {
                System.out.println("BOOBOO");
            }

            // Delete
            else if (choice == 4) {
                System.out.println("BOOBOO");
            }

            // Turn off
            else if (choice == 5) {
                running = false;
                System.out.println("TURNING OFF... GOODBYE.");
                scanner.close();
            }

            // Invalid Input (not 1, OR 2, OR 3, OR 4)
            else {
                System.out.println("Invalid input detected. Please try again.");
                
                // Clear the invalid input from choice
                scanner.nextLine();
            }
        }
    }

    // Create 'Task' class (MAKE PUBLIC IF HAVING ISSUES)
    class Task {
        private String name;
        private String desc;
        private String priority;
    }
}