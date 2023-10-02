package calculator;
import java.util.Scanner;
/**
 *
 * @author dherb
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Welcome to my Calculator! Please select an Operation.");
        System.out.println("1. For Addition");
        System.out.println("2. For Subtraction");
        System.out.println("3. For Multiplication");
        System.out.println("4. For Division");
        
        int choose = scan.nextInt();
        
        System.out.println("Enter your first number");
        int x = scan.nextInt();
        System.out.println("Enter your second number");
        int y = scan.nextInt();
        
        if(choose == 1){
            Addition A = new Addition();
            
            System.out.println(x + " + " + y + "... " + "The Answer is: " + A.add(x,y)+"!");
        }
        else if(choose == 2){
            Subtraction S = new Subtraction();
            
            System.out.println(x + " - " + y + "... " + "The Answer is: " + S.sub(x,y)+"!");
        }
        else if(choose == 3){
            Multiplication M = new Multiplication();
            
            System.out.println(x + " x " + y + "... " + "The Answer is: " + M.mult(x,y)+"!");
        }
        
        else if(choose == 4){
            Division D = new Division();
            
            System.out.println(x + " / " + y + "... " + "The Answer is: " + D.div(x,y)+"!");
        }
        else{
            System.out.println("Option is not recognised. Please pick an Operation.");
        }
    }
    
}
