package ch1;

import java.util.Scanner;

public class no2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int hundreds = A * (B / 100);
        int tens = A * (B % 100 / 10);
        int units = A * (B % 10);
        int mul = A * B;
        System.out.println("" + units + "\n" + tens + "\n" + hundreds + "\n" + mul);
    }
}