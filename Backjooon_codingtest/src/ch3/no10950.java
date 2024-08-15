package ch3;

import java.util.Scanner;

public class no10950 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();

        for(int i = 1; (long)i <= T; ++i) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }

    }
}
