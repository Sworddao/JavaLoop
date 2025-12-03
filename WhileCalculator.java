import java.util.Scanner;

public class WhileCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int choice = 1;

        while (choice == 1) {

            System.out.println("Enter two numbers:");
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            int op = scan.nextInt();

            switch (op) {
                case 1: System.out.println("Result = " + (a + b)); break;
                case 2: System.out.println("Result = " + (a - b)); break;
                case 3: System.out.println("Result = " + (a * b)); break;
                case 4: System.out.println("Result = " + (a / b)); break;
                default: System.out.println("Invalid choice!");
            }

            System.out.println("\nEnter 1 to continue or 0 to exit:");
            choice = scan.nextInt();
        }

        System.out.println("Calculator closed.");
    }
}
