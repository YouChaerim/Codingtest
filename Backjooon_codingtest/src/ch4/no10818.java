package ch4;

import java.util.Scanner;

public class no10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long max = -1000000L;
        long min = 1000000L;

        for(int i = 0; (long)i < N; ++i) {
            int A = sc.nextInt();
            if ((long)A > max) {
                max = (long)A;
            }

            if ((long)A < min) {
                min = (long)A;
            }
        }

        System.out.println("" + min + " " + max);
    }
}
