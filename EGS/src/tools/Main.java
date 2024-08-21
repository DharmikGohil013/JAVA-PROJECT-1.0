// package egovernance.main;
package tools;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Display logo
        displayLogo();
        
        // Show opening page message
        showOpeningPage();

        // Clear screen (platform-specific, basic approach shown)
        clearScreen();

        // Show menu
        showMenu();
    }

    private static void displayLogo() {
        System.out.println("E-Governance System");
        try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void showOpeningPage() {
        System.out.println("Opening page...");
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void clearScreen() {
        // Basic clear screen approach (works in some terminals)
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void showMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Admin (University settings)");
        System.out.println("2. Faculties");
        System.out.println("3. Students");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Select an option: ");
        int choice = scanner.nextInt();

        // Handle the choice (to be implemented)

        switch (choice) {
            case 1:
                AdminSection.adminLogin();
                break;
            // Additional cases for other options
        }
    }
}
