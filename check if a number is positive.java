import java.util.Scanner;
package week.pkg1.code;

public class IsPositive {
    public static void main(String[] args) {
        // create i/o reader
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a number");
        double number = Double.parseDouble(reader.nextLine());
        
        if (number >= 0) {
            System.out.println("Your number is positive.");
        } else {
            System.out.println("Your number is negative.");
        }
        
    }
    
}