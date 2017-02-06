import java.util.Scanner;

package week.pkg1.code;

public class UsernameCheck {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // check username string. 3 cases. Either fits one username of 2 or does not fit either.
        System.out.print("Enter your username.");
        String username = reader.nextLine();
        System.out.print("Enter your password");
        String password = reader.nextLine();
        
        if ((username.equals("alex")) && (password.equals("mightyducks"))) {
            System.out.print("You are now logged into the system!");
        } else if ((username.equals("emily")) && (password.equals("cat"))) {
            System.out.print("You are now logged into the system!");
        } else {
            System.out.print("You have entered an invalid username or password");    
    }
    }
}
