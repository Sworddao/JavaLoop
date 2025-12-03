import java.util.Scanner;

public class ReversePositiveInteger{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int a = scan.nextInt();
        
        int revNum = 0;
        // Runs the loop until the value of a becomes less than 0.
        while(a > 0){
            revNum = revNum * 10 + a % 10; //a % 10 takes the last number from the a 
            a /= 10; // removes the last number from a     
        }
        System.out.println("Reverse number is: " + revNum);
        
        
    }
}