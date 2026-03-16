import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        for(int j = 0; j < i; j++) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }
    }
}