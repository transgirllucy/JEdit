import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // ANSI escape code for green text
    String lime = "\u001B[32m";
    // Scanner for user input
    Scanner scanner = new Scanner(System.in);
    // ArrayList to store notes
    ArrayList<String> notes = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main(); // Create an instance of Main to access non-static members
        main.run(); // Call the run method to start the program
    }

    public void run() {
        while (true) {
            System.out.print("Enter a note (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            // Exit condition
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the input to the notes list
            notes.add(input);

            // Print all notes
            System.out.println(lime + "Current notes:");
            for (String note : notes) {
                System.out.println(note);
            }
        }

        // Close the scanner
        scanner.close();
        System.out.println("Exiting the program.");
    }
}