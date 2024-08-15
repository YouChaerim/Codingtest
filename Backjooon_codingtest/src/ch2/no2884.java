package ch2;

import java.util.Scanner;

public class no2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (M - 45 < 0) {
            --H;
            M = M - 45 + 60;
            if (H == -1) {
                H = 23;
            }

            System.out.println("" + H + " " + M);
        } else {
            M -= 45;
            System.out.println("" + H + " " + M);
        }

    }
}