import java.util.Scanner;

public class Activity7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an email: ");
            String email = scanner.nextLine().trim();
            int atIndex = email.indexOf('@');
            if (atIndex != -1) {
                String username = email.substring(0, atIndex);
                String domain = email.substring(atIndex + 1);
                System.out.println("\nEmail Entered: " + email);
                System.out.println("Length: " + email.length() + " characters");
                System.out.println("Username: " + username);
                System.out.println("Domain: " + domain);
            } else {
                System.out.println("\nInvalid email format. Missing '@' symbol.");
            }
        }
        }
    }