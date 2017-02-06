import java.util.Scanner;

package week.pkg1.code;

public class UserInputPractice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = reader.nextLine(); // Reads a line of input from user and assigns it to var name
        
        System.out.println("Hi, " + name);
    }
    
}
