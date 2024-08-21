package tools;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showLogo();
        showMenu();
    }

    private static void showLogo() {
        System.out.println("E-Governance System");
        try {
            Thread.sleep(3000); // Show logo for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Opening page ........");
        try {
            Thread.sleep(1000); // Pause before clearing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clearScreen();
    }

    private static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Admin");
            System.out.println("2. Faculties");
            System.out.println("3. Students");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    AdminSection.adminLogin();
                    break;
                case 2:
                    // Faculties section (to be implemented)
                    break;
                case 3:
                    // Students section (to be implemented)
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
