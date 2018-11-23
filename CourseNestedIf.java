package coursenestedif;
import java.util.Scanner;

public class CourseNestedIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Enter your Course \n"
                +"CHOICES: \n"
                + "[1]IT \n"
                + "[2]CS \n"
                + "[3] BSDA");
        int course = sc.nextInt();
        if(course==1){
            System.out.println("What is your Major? \n"
                    + "CHOICES: \n"
                    + "[1] Network and Security\n"
                    + "[2] Web Development \n"
                    + "[3] Enterprice");
            int ITmin = sc.nextInt();
            
            if(ITmin==1){
                System.out.println("Your course is Information Technology majoring on Network and Security ");
            }else if(ITmin==2){
                System.out.println("Your course is Information Technology majoring on Webdevepment ");
            }else if(ITmin==3){
                System.out.println("Your course is Information Technology majoring on BSDA");
            }else{
                System.out.println("Error: Please Write Properly");
            } 
            
            
        }else if(course==2){
            System.out.println("What is Your Major? \n"
                    + "CHOICES: \n"
                    + "[1] Animation \n"
                    + "[2] Mobile Development \n"
                    + "[3] Digital Arts");
            int CSmin = sc.nextInt();
            
            if(CSmin==1){
                System.out.println("Your course is COmputer SCience and your major is Animation");
            }else if(CSmin==2){
                System.out.println("Your course is COmputer SCience and your major is Mobile Development");
            }else if(CSmin==3){
                 System.out.println("Your course is COmputer SCience and your major is Digital Arts");
            }else {
                System.out.println("Error: Please Enter Proper Name");
            }
            
            
        }else if(course==3){
            System.out.println("BSDA");
        }else{
            System.out.println("Error");
        }
    }
    
}
        
