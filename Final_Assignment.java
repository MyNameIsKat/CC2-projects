package final_assignment;
import java.util.Scanner;

public class Final_Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("=== Make an Array ===");
        System.out.println("=====================");
        System.out.print("Enter array length: ");
        int length=sc.nextInt();
        int x[]=new int[length];
        String cho="";
        
        for(int i=0; i<x.length; i++){
            System.out.print("Enter Element ["+i+"] :");
            x[i]=sc.nextByte();
        }
        
        System.out.println("=====================");
        System.out.println("===== Fibonacci =====");
        System.out.println("======== or =========");
        System.out.println("===== Factorial =====");
        System.out.println("=====================");
        
        while(!cho.equals("1")&&!cho.equals("2")){
            System.out.print("Choice: ");
            cho=sc.nextLine();
        }
        
        if(cho.equals("1")){
            displayFibo(x);
        }else{
            displayFacto(x);
        }
        
        
        
    }static int Fibo(int num){
        
        if(num<=1){
            return 1;
        }else{
            return Fibo(num-1)+Fibo(num-2);
        }
        
    }static void displayFibo(int x[]){
        
        for(int i=0; i<x.length; i++){
            System.out.println( Fibo(x[i]));
        }
        
    }static int Facto(int num){
        
        if(num<=1){
            return 1;
        }else{
            return num*Facto(num-1);
        }
        
    }static void displayFacto(int x[]){
        
        for(int i=0; i<x.length; i++){
            System.out.println( Fibo(x[i]));
        }
        
    }
    
}
