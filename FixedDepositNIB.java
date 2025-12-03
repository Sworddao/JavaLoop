import java.util.Scanner;

public class FixedDepositNIB{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            System.out.print("Enter deposit amount(over 1000): ");
            double P = scan.nextDouble();
            if(P < 1000){
                break;
            }
            
            System.out.print("Enter annual interest rate(8%-12%): " );
            double annualRate = scan.nextDouble();
            
            System.out.print("Enter duration in years(year 1 to 5): ");
            int year = scan.nextInt();
            
            //converting years to months..
            
            int month = year * 12;
            double monthlyRate = annualRate / 12 / 100;
            
            // calculating maturing fees
            
            double A = P * Math.pow(1 + monthlyRate, month);
            
            double feeRate = 0.005;
            double fee = A * feeRate;
            double finalAmount = A - fee;
            
            System.out.println("\n-----Fixed Deposit-------");
            System.out.println("Principal amount(P): " + P);
            System.out.println("Maturity amount(A): " + A);
            System.out.println("Processing Fee: " + fee);
            System.out.println("Final Amount: " + finalAmount);
            
            System.out.println("\n Add another Fixed Deposit ? ");
            System.out.println("1. Yes ");
            System.out.println("2. No ");
            int response = scan.nextInt();
            
            if(response != 1){
                break;
            }
        }
        System.out.println("Exiting...");
    }
}