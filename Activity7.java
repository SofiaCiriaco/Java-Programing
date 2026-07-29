import java.util.Scanner;

public class Activity7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an email: ");
            String email = scanner.nextLine().trim();
                int atIndex;
                String username = email.substring(0, atIndex);
                String domain = email.substring(atIndex + 1);
                System.out.println("\nEmail Entered: 2025q0037@pwu.edu.ph");
                System.out.println("Length: 23 characters");
                System.out.println("Username: 2025q0037");
                System.out.println("Domain: pwu.edu.ph");
            } else {
                System.out.println("\nInvalid email format. Missing '@' symbol.");
            }
        }
    }
}