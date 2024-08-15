package basic_100question;

import java.util.Scanner;

public class no1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr = sc.nextLine().split("\\.");

        int Y = Integer.valueOf(arr[0]);
        int M = Integer.valueOf(arr[1]);
        int D = Integer.valueOf(arr[2]);

        System.out.printf("%02d-%02d-%04d", D, M, Y);
    }
}
