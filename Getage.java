package getage;

import java.util.Scanner;

public class Getage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        //Ask for the current year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        
        // Ask for the user's birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        //Calculate age
        int age = currentYear - birthYear;
        
        // Print the age
        System.out.println("You are " + age + " years old.");
        
        scanner.close();
        
    }
    
}
