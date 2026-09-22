public class Finals {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         String password = "1234";

         System.out.println("ENTER PASSWORD: ");
         String entered = scn.nextLine();

         while(!entered.equals(password)){
                System.out.println("WRONG PASSWORD!");
                System.out.println("ENTER PASSWORD: ");
                entered = scn.nextLine();
         }
         System.out.println("ACCESS GRANTED!");
         
    }
}