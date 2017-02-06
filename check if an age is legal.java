import java.util.Scanner;

package week.pkg1.code;

public class IsLegal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        
        // check if age equal to or greater than 18
        
        if (age >= 18){
            System.out.println("You are of legal age!");
        } else {
            System.out.println("You are not of legal age.");
        }
    }
}