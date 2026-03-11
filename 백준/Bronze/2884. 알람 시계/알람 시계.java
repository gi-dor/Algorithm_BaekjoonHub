import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 첫번째 줄에 정수 H 와 M 이 주어진다 0 <= H <=-23 , 0<=M<=59
        // 주어진 시간은 H시 M분을 의미한다
        // 입력시간은 24시간 표현을 사용한다 입력한 하루의 시간은 0:0 ~ 끝은 23:59

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        // 12 30 입력시 11 45
        // M이 45보다 크면 M - 45
        // M이 45보다 작으면 H -1 , 60 - (45-M)
        //                 12 - 1 , 60 - (45-30)
        //                  11 , 60-15
        //                  11 , 45

        // M이 45보다 작으면 H -1 , 60 - (45-M)
        //     10 20 입력  10 - 1 , 60 - (45-20)
        //                  9 , 60-(25)
        //                  9 , 35

        if(M < 45) {
            H--;
            M = 60 - (45 -M);
            if(H < 0 ) {
                H = 23;
            }
            System.out.println( H + " " + M);
        } else {
            // M이 45보다 크면
        // 12 55 입력시       12 , 55-45
        //                   12 , 10
            System.out.println(H + " " + (M - 45) );
        }
    }
}