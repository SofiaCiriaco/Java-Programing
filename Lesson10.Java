import java.util.Scanner;

public class Lesson10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter your age:");
        int age = scn.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        else if (age < 19) {
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
        else if (age < 17) {
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}