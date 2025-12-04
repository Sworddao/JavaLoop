import java.util.Scanner;

public class SquareDigit{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number");
        int num = scan.nextInt();
        
        int squareNum = 0;
        int tempNum = num;
        
        while(tempNum > 0){
            
            int digit = tempNum % 10;
            squareNum += digit * digit;
            tempNum /= 10;
            
        }
        System.out.println("Square of each digit of : " + num + " is " + squareNum);
    }
}