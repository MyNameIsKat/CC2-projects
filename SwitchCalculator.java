package switchcalculator;
import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Menu
        System.out.println("|Basic Calculator|");
        System.out.println("================="
                +        "\n======Menu======="
                +        "\n================="
                +        "\n||   Add or +  ||"
                +        "\n||Subtract or -||"
                +        "\n||Multiply or *||"
                +        "\n|| Divide or / ||"
                +        "\n|| Modulo or % ||"
                +        "\n================="
                +        "\n");
        //User Input
        System.out.print("Enter Operator: ");
        String operator=sc.nextLine();
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        
        //Solving
        switch (operator) {
            case "Add":
            case "+":
                System.out.println("ANSWER: "+(num1+num2));
                break;
            case "Subtract":
            case "-":
                System.out.println("ANSWER: "+(num1-num2));
                break;
            case "Multiply":
            case "*":
                System.out.println("ANSWER: "+(num1*num2));
                break;
            case "Divide":
            case "/":
                System.out.println("ANSWER: "+(num1/num2));
                break;
            default:
                System.out.println("ANSWER: "+(num1%num2));
                break;
        }
    }
    
}
