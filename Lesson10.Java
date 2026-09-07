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

        System.out.println(num1 % 2 == 0 ? "Even" : "Odd");

        System.out.println(num1 % 2 == 0)? 
        "Monday" : (num1 ==2)? 
        "Tuesday" : (num1 ==3)? 
        "Wednesday" : (num1 ==4)? 
        "Thursday" : (num1 ==5)? 
        "Friday" : (num1 ==6 || num1 ==7)? "Weekend Na!" : "Invalid Input";

        System.out.println("Enter your Age: You are 21 or older.");
        int age = scn.nextInt();
        else if (age < 21) {
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
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
        