package username_password;
import java.util.Scanner;

public class Username_Password {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("==============="
                +        "\n||  Sign Up  ||"
                +        "\n==============="
                +        "\n");
        
        System.out.print("||Enter Username: ");
        String username=sc.nextLine();
        System.out.print("||Enter Password: ");
        String password=sc.nextLine();
        
        System.out.println("\n=============="
                +          "\n||Thank You!||"
                +          "\n==============");
        
        System.out.print("\n||Re-Enter Password:");
        String repassword=sc.nextLine();
        
        if(password.equals(repassword)){
            System.out.println("\nCongratulations "+username);
            System.out.println("================"
                    +        "\n||  you have  ||"
                    +        "\n||successfully||"
                    +        "\n|| signed up! ||"
                    +        "\n================");
        }else{
            System.out.println("\n================"
                    +          "\n||  Signed up  ||"
                    +          "\n||    Failed   ||"
                    +          "\n================");
            
        }
    }
    
    
}
