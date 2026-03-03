import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int A ,B ,C ;
        int result1 , result2 , result3 , result4;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        if(2 <= A && A <= 10000 && 
           2 <= B && B <= 10000 && 
           2 <= C && C <= 10000) {
            result1 = (A+B) % C; 
            result2 = ( (A%C) + (B%C) ) % C;
            result3 = (A*B) % C;
            result4 = ( (A%C) * (B%C) ) % C;
            
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
             
        }
                
        
    }
    
}