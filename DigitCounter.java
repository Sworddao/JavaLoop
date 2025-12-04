import java.util.Scanner;

public class DigitCounter{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter numbers: ");
        int num = scan.nextInt();
        
        int count = 0;
        int temp = num;
        
        while(temp != 0){
            
            temp /= 10;
            count ++;
        }
        System.out.println("The total number of digits is: " + count);        
        
    }
}