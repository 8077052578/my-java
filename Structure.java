
import java.util.ArrayList;

// Class definition
public class Structure {

    // Class variables (optional)
    String message = "Welcome to Java!";

    // Main method - program entry point
    public static void main(String[] args) {
        System.out.println("Executing main method...");
        // Call other methods or perform operations
        Structure program = new Structure();
        program.displayMessage();
    }
    public void displayMessage() {
        System.out.println(message);
    }
}