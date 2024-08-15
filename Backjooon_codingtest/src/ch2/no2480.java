package ch2;

import java.util.Scanner;

public class no2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int money = 0;
        if (A != B && A != C && B != C) {
            if (A > B && A > C) {
                money += A * 100;
            } else if (B > A && B > C) {
                money += B * 100;
            } else {
                money += C * 100;
            }
        } else if (A == B && A != C) {
            money += 1000 + A * 100;
        } else if (A == C && A != B) {
            money += 1000 + A * 100;
        } else if (B == C && B != A) {
            money += 1000 + B * 100;
        } else if (A == B && A == C) {
            money = 10000 + A * 1000;
        }

        System.out.println(money);
    }
}
