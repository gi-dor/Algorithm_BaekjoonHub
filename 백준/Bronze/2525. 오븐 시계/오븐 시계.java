import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   //  시간
        int b = sc.nextInt();   // 분
        int c = sc.nextInt();   // 요리되는 시간
        //        if(b + c < 60) {
//            System.out.println(a + " " +(b + c));
//        } else if(b + c > 60) {
//            System.out.println((a + 1) + " " + ((b + c) - 60));
//        }


        // 17 50 입력
        // 80 입력
//        17 * 60  + 50  = 1070분
//        1070 분 + C 입력분 80
        //        17 *  60  + 50 ====> 1070분
        int min = (a * 60 + b) ;
        min += c;   // 1070 분 + 입력값 80 ===> 1150

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);

    }
}