import java.util.Scanner;

/**
 * Activity 7: Email Analyzer
 * This program takes an email address from the user and analyzes its components
 * (username, domain, extensions, and lengths) using Java String methods.
 */
public class EmailAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.summary);
        
        // --- INPUT ---
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine().trim();
        
        System.out.println("\n----------------------------------------");
        System.out.println("             EMAIL ANALYSIS             ");
        System.out.println("----------------------------------------");

        // Basic validation check before analyzing
        if (email.contains("@") && email.contains(".")) {
            
            // --- STRING MANIPULATION ---
            int atIndex = email.indexOf("@");
            int lastDotIndex = email.lastIndexOf(".");
            
            // Extract components using substring
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex + 1);
            String extension = email.substring(lastDotIndex);
            
            // Calculate lengths
            int totalLength = email.length();

            // --- OUTPUT ---
            System.out.printf("%-20s: %s\n", "Full Email", email);
            System.out.printf("%-20s: %d characters\n", "Total Length", totalLength);
            System.out.printf("%-20s: %s\n", "Username", username);
            System.out.printf("%-20s: %s\n", "Domain Name", domain);
            System.out.printf("%-20s: %s\n", "Domain Extension", extension);
            
        } else {
            System.out.println("Error: Invalid email format! Missing '@' or '.'.");
        }
        
        System.out.println("----------------------------------------");
        scanner.close();
    }
}