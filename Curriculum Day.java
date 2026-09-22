import java.util.Scanner;

class CurriculumDay {
    private static final Scanner INPUT = new Scanner(System.in);

    static class Console {
        static void Clear() { System.out.print("\033[H\033[2J"); System.out.flush(); }
        static void Write(String text) { System.out.print(text); }
        static void WriteLine() { System.out.println(); }
        static void WriteLine(String text) { System.out.println(text); }
        static String ReadLine() { return INPUT.nextLine(); }
        static void ReadKey() { INPUT.nextLine(); }
    }

    public static void main(String[] args) {
// ============================================
//       SCHOOL CANTEEN ORDERING SYSTEM
// ============================================

// Variables
String orderAgain = "Y";

int itemNumber;
int quantity;
int orderCount = 0;

String itemName;
double price;
double subtotal;
double grandTotal = 0;

// HEADER
Console.Clear();

Console.WriteLine("╔══════════════════════════════════════════╗");
Console.WriteLine("║        🏫 SCHOOL CANTEEN SYSTEM          ║");
Console.WriteLine("║          Welcome, Students!              ║");
Console.WriteLine("╚══════════════════════════════════════════╝");

Console.WriteLine();
Console.WriteLine("        🍔 Fresh • Affordable • Delicious 🍟");
Console.WriteLine();

// WHILE LOOP
// Repeats the ordering process
while ("Y".equalsIgnoreCase(orderAgain))
{
    Console.WriteLine();
    Console.WriteLine("╔══════════════════════════════════════════╗");
    Console.WriteLine("║                MENU                      ║");
    Console.WriteLine("╠══════════════════════════════════════════╣");

    Console.WriteLine("║  FOOD                                    ║");
    Console.WriteLine("║  1 - Burger                 ₱50          ║");
    Console.WriteLine("║  2 - Fries                  ₱30          ║");
    Console.WriteLine("║  3 - Sandwich               ₱40          ║");
    Console.WriteLine("║  4 - Hotdog Sandwich        ₱45          ║");
    Console.WriteLine("║  5 - Chicken Sandwich       ₱60          ║");
    Console.WriteLine("║  6 - Spaghetti              ₱55          ║");
    Console.WriteLine("║  7 - Siomai                 ₱35          ║");

    Console.WriteLine("║                                          ║");
    Console.WriteLine("║  SNACKS & DESSERTS                       ║");
    Console.WriteLine("║  8 - Donut                 ₱25          ║");
    Console.WriteLine("║  9 - Chocolate Bar         ₱20          ║");
    Console.WriteLine("║ 10 - Cupcake               ₱30          ║");
    Console.WriteLine("║ 11 - Banana Bread          ₱35          ║");

    Console.WriteLine("║                                          ║");
    Console.WriteLine("║  DRINKS                                  ║");
    Console.WriteLine("║ 12 - Bottled Water         ₱20          ║");
    Console.WriteLine("║ 13 - Juice                 ₱25          ║");
    Console.WriteLine("║ 14 - Iced Tea              ₱30          ║");
    Console.WriteLine("║ 15 - Chocolate Drink       ₱40          ║");

    Console.WriteLine("╚══════════════════════════════════════════╝");

    // Ask for item number
    Console.Write("Enter item number: ");
    itemNumber = Integer.parseInt(Console.ReadLine());

    // ============================================
    // IF-ELSE
    // Determine selected food and price
    // ============================================

    switch (itemNumber)
    {
        case 1 -> { itemName = "Burger"; price = 50; }
        case 2 -> { itemName = "Fries"; price = 30; }
        case 3 -> { itemName = "Sandwich"; price = 40; }
        case 4 -> { itemName = "Hotdog Sandwich"; price = 45; }
        case 5 -> { itemName = "Chicken Sandwich"; price = 60; }
        case 6 -> { itemName = "Spaghetti"; price = 55; }
        case 7 -> { itemName = "Siomai"; price = 35; }
        case 8 -> { itemName = "Donut"; price = 25; }
        case 9 -> { itemName = "Chocolate Bar"; price = 20; }
        case 10 -> { itemName = "Cupcake"; price = 30; }
        case 11 -> { itemName = "Banana Bread"; price = 35; }
        case 12 -> { itemName = "Bottled Water"; price = 20; }
        case 13 -> { itemName = "Juice"; price = 25; }
        case 14 -> { itemName = "Iced Tea"; price = 30; }
        case 15 -> { itemName = "Chocolate Drink"; price = 40; }
        default -> {
            Console.WriteLine();
            Console.WriteLine("❌ Invalid item number.");
            Console.WriteLine("Please select an item from 1-15.");
            continue;
        }
    }

    // ============================================
    // ASK FOR QUANTITY
    // ============================================

    Console.Write("Enter quantity: ");
    quantity = Integer.parseInt(Console.ReadLine());

    if (quantity <= 0)
    {
        Console.WriteLine();
        Console.WriteLine("❌ Quantity must be greater than zero.");
        continue;
    }

    // ============================================
    // CALCULATE SUBTOTAL
    // ============================================

    subtotal = price * quantity;

    // ============================================
    // ORDER SUMMARY
    // ============================================

    Console.WriteLine();
    Console.WriteLine("╔══════════════════════════════════════════╗");
    Console.WriteLine("║              ORDER SUMMARY               ║");
    Console.WriteLine("╠══════════════════════════════════════════╣");
    Console.WriteLine("║ Item       : " + itemName);
    Console.WriteLine("║ Price      : ₱" + String.format("%.2f", price));
    Console.WriteLine("║ Quantity   : " + quantity);
    Console.WriteLine("║ Subtotal   : ₱" + String.format("%.2f", subtotal));
    Console.WriteLine("╚══════════════════════════════════════════╝");

    // Add subtotal to grand total
    grandTotal = grandTotal + subtotal;

    // Count the order
    orderCount++;

    // ============================================
    // ASK IF CUSTOMER WANTS TO ORDER AGAIN
    // ============================================

    Console.WriteLine();
    Console.Write("Do you want to order again? (Y/N): ");
    orderAgain = Console.ReadLine();
}

// ============================================
// FINAL RECEIPT
// ============================================

Console.WriteLine();
Console.WriteLine("╔══════════════════════════════════════════╗");
Console.WriteLine("║              FINAL RECEIPT               ║");
Console.WriteLine("╠══════════════════════════════════════════╣");
Console.WriteLine("║                                          ║");
Console.WriteLine("║ Number of Orders : " + orderCount);
Console.WriteLine("║ Grand Total      : ₱" + String.format("%.2f", grandTotal));
Console.WriteLine("║                                          ║");
Console.WriteLine("╠══════════════════════════════════════════╣");
Console.WriteLine("║      Thank you for ordering! 😊          ║");
Console.WriteLine("║         Please come again!               ║");
Console.WriteLine("╚══════════════════════════════════════════╝");

Console.WriteLine();
Console.WriteLine("Press any key to exit...");
Console.ReadKey();
    }
}