package ch4;

import java.util.Scanner;

public class no5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];

        int i;
        for(i = 0; i < 28; ++i) {
            int sucess = sc.nextInt();
            arr[sucess - 1] = 1;
        }

        for(i = 0; i < 30; ++i) {
            if (arr[i] != 1) {
                System.out.println(i + 1);
            }
        }

    }
}
