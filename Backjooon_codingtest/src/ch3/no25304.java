package ch3;

import java.util.Scanner;

public class no25304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        int N = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < N; ++i) {
            long a = sc.nextLong();
            int b = sc.nextInt();
            sum = (int)((long)sum + a * (long)b);
        }

        if ((long)sum == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
