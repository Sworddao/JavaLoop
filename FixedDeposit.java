import java.util.Scanner;

public class FixedDeposit{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            System.out.println("Enter deposit amount (over 1000) : ");
            double P = scan.nextDouble();
            
            if(P < 1000){
                continue;
            }
            
            System.out.println("Enter annual interest rate (8-12%): ");
            double annualRate = scan.nextDouble();
            
            if(annualRate > 12 || annualRate < 8){
                continue;
            }
            
            System.out.println("Enter duration in years, less than 5: ");
            int year = scan.nextInt();
            
            if(year > 5 || year < 1){
                continue;
            }
            
            int month = year * 12;
            double monthlyRate = annualRate / 12 / 100;
            
            double A = P * Math.pow(1 + monthlyRate, month); 
            
            double feeRate = 0.005;
            double fee = P * feeRate;
            double finalAmount = A - fee;
            
            scan.nextLine();
            
            System.out.println("\n-----Fixed Deposit-------");
            System.out.println("Principal amount(P): " + P);
            System.out.println("Maturity amount(A): " + A);
            System.out.println("Processing Fee: " + fee);
            System.out.println("Final Amount: " + finalAmount);   
            
            System.out.println("Do you want to continue:(yes/no)?");
            String response = scan.nextLine();
            
            if(!response.equalsIgnoreCase("yes")){
                break;
            }
            
            
        }
        
        
        
    }
}