package ch3;

import java.util.Scanner;

public class no2739 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i < 10; ++i) {
            int mul = N * i;
            System.out.println("" + N + " * " + i + " = " + mul);
        }

    }
}
