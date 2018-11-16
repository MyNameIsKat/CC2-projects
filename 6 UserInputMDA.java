package userinputmda;
import java.util.Arrays;
import java.util.Scanner;

public class UserInputMDA {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter Number of Rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int columns=sc.nextInt();
        
        int [][]table=new int[rows][columns];
        
        for(int c=0;c<columns;c++){
            System.out.println("COLUMN "+(c+1));
            for(int r=0;r<rows;r++){
                System.out.print("Enter NO. for ROW["+(r+1)+"] :");
                table[r][c]=sc.nextInt();
            }
        }
        
        /*for(int c=0;c<columns;c++){
            System.out.println("COLUMN "+c);
            for(int r=0;r<rows;r++){
                System.out.println("Enter NO. for ROW"+r+" : "+table[r][c]);
            }
        }*/
        
        System.out.println("\n"+Arrays.deepToString(table));
       
    }
    
}
