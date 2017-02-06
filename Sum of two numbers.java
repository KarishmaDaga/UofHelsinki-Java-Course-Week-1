import java.util.Scanner;
package week.pkg1.code;

/**
 * @author Karishma Daga
 */
public class Week1Code {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Take two user input numbers and return stheir sum
        
        System.out.print("Enter a number");
        int firstNumber = Integer.parseInt(reader.nextLine());
        
        System.out.print("Enter another number.");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        int sum = firstNumber + secondNumber;
        
        System.out.println(sum);
                
                
    }
}