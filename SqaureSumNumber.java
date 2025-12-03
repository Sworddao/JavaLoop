public class SqaureSumNumber{
    public static void main(String[] args){
        int i = 0;
        int sum = 0;
        do{
            sum += i * i;
            i++;
        }while( i <= 10);
        System.out.println("The sum of the square of the first 10 natural numbers is: " + sum);
    }
}