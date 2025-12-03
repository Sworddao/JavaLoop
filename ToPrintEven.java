public class ToPrintEven{
    public static void main(String[] args){
    
        System.out.println("for Loop");    
        for(int i = 2; i <= 10; i += 2){
            System.out.println(i);
        }
        
        System.out.println("while loop");
        int i = 2;
        while(i <= 10){
            System.out.println(i);
            i += 2;
        }
        
        System.out.println("do-while loop");
        int j = 2;
        do{
            System.out.println(j);
            j += 2;
        }while(j <= 10);
    }
}