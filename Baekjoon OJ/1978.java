import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            boolean prime = true;
            int a = sc.nextInt();
            if (a < 2) {
                prime = false;
            } else if (a == 2) {
                prime = true;
            } else {
                for (int j = 2; j < a; j++) {
                    if (a % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if(prime)
                cnt++;
        }
        System.out.println(cnt);
    }
}