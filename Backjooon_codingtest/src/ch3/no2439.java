package ch3;

import java.util.Scanner;

public class no2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; ++i) {
            int k;
            for(k = 1; k <= N - i; ++k) {
                System.out.print(" ");
            }

            for(k = 0; k < i; ++k) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
