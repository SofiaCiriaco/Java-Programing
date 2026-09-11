import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initial setup
        final int CORRECT_PIN = 1234;
        double balance = 5000.00;
        
        // PIN Verification
        System.out.print("Enter PIN: ");
        int enteredPin = scanner.nextInt();
        
        if (enteredPin == CORRECT_PIN) {
            System.out.println("Login successful!");
            
            // Display ATM Menu
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            // Menu Operations using switch
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: ₱" + balance);
                    break;
                    
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful! Your updated balance is: ₱" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful! Your updated balance is: ₱" + balance);
                    }
                    break;
                    
                case 4:
                    System.out.println("Thank you for using our ATM system.");
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            
        } else {
            System.out.println("Invalid PIN. Access Denied.");
        }
        
        scanner.close();
    }
}
