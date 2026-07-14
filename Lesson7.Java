public class OnlineShoppingReceipt {
    public static void main(String[] args) {
        // 1. Assignment Operators & Variables
        String customerName = "Josie Rizal";
        double tabletPrice = 299.50;
        double stylusPrice = 1200.75;
        double tabletCasePrice = 450.25;

        // 2. Arithmetic Operators to compute totals
        double subtotal = tabletPrice + stylusPrice + tabletCasePrice;
        double vat = subtotal * 0.12; // 12% VAT
        double grandTotal = subtotal + vat;

        // 3. Type Casting to get the Whole Number
        int wholeNumberTotal = (int) grandTotal;

        // 4. Comparison Operator to determine Free Shipping (e.g., true if over 1500)
        boolean isFreeShipping = grandTotal > 1500.00;

        // 5. Output Display
        System.out.println("ONLINE SHOPPING RECEIPT\n");
        System.out.println("Customer : " + customerName);
        System.out.println();
        System.out.println("Tablet : " + tabletPrice);
        System.out.println("Stylus : " + stylusPrice);
        System.out.println("Tablet Case : " + tabletCasePrice);
        System.out.println();
        System.out.println("Subtotal : " + subtotal);
        System.out.println("VAT : " + vat);
        System.out.println("Grand Total : " + grandTotal);
        System.out.println();
        System.out.println("Whole Number : " + wholeNumberTotal);
        System.out.println();
        System.out.println("Free Shipping : " + isFreeShipping);
    }
}
