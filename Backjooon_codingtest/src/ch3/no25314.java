package ch3;

import java.util.Scanner;

public class no25314 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int I = N / 4;

        for(int i = 1; i <= I; ++i) {
            System.out.print("long ");
        }

        System.out.print("int");
    }
}