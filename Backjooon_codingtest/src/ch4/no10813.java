package ch4;

import java.util.Scanner;

public class no10813 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        int i;
        for(i = 0; i < N; ++i) {
            arr[i] = i + 1;
        }

        for(i = 0; i < M; ++i) {
            int F = sc.nextInt();
            int E = sc.nextInt();
            int tmp = arr[F - 1];
            arr[F - 1] = arr[E - 1];
            arr[E - 1] = tmp;
        }

        for(i = 0; i < N; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}
