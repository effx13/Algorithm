import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c - b == 0)
            System.out.println("-1");
        else if (a / (c - b) + 1 < 0)
            System.out.println("-1");
        else System.out.println(a / (c - b) + 1);
    }
}