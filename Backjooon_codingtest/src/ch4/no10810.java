package ch4;

import java.util.Scanner;

public class no10810 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        int b;
        for(b = 0; b < M; ++b) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            for(int k = sc.nextInt(); i <= j; ++i) {
                arr[i - 1] = k;
            }
        }

        for(b = 0; b < N; ++b) {
            System.out.print(arr[b] + " ");
        }

    }
}
