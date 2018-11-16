package guessinggame;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to be guessed: ");
        int answer=sc.nextInt();
        
        System.out.println("Guess the Number!!!");
        int guess=0;
        if(answer%2==0){
            System.out.println("It is EVEN");
        }else{
            System.out.println("It is ODD");
        }
        
        while(guess!=answer){
            System.out.print("Enter Guess: ");
            guess=sc.nextInt();
            if(guess<answer){
                System.out.println("HIGHER");
            }else if(guess>answer){
                System.out.println("LOWER");
            }
        }
        System.out.println("Congratulations!!!");
        
    }
    
}
