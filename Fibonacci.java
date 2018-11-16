package fibonacci;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        //Title
        System.out.println("===================="
                +        "\n||Fibonacci Finder||"
                +        "\n===================="
                +        "\n");
        
        //user Input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter nth Number: ");
        int nth=sc.nextInt();
        
        //inforamtion row
        System.out.print("\n\t");
        for(int f=0;f<=nth;f++){
            System.out.print("f"+f+"\t");
        }
        
        //first row
        System.out.println("");
        System.out.println("0");
        
        //fibonacci trianglez
        for(int count =0; count<=nth;count++){
            System.out.print("0\t");
            for(int i=0; i<=count;i++){
                System.out.print(Fibo(i)+"\t");
            }  
            System.out.println("");
        }
        
        //printing of answer
        System.out.println("\n"+nth+"nth Fibonacci = "+Fibo(nth));
    }
    
    //fibonacci computation
    static int Fibo(int num){
        if(num<=1){
            return 1;
        }else{
            return Fibo(num-1)+Fibo(num-2);
        }
    }
}
