package ch4;

import java.util.Scanner;

public class no2562 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = 0;

        for(int i = 0; i < 9; ++i) {
            int N = sc.nextInt();
            if (N > max) {
                max = N;
            }

            if (N == max) {
                count = i;
            }
        }

        System.out.println(max);
        System.out.println(count + 1);
    }
}