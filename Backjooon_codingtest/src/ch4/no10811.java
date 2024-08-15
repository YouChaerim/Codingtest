package ch4;

import java.util.Scanner;

public class no10811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        int i;
        for(i = 0; i < N; ++i) {
            arr[i] = i + 1;
        }

        for(i = 0; i < M; ++i) {
            int a = sc.nextInt() - 1;

            for(int b = sc.nextInt() - 1; a <= b; ++a) {
                int var10000 = arr[a];
                arr[a] = arr[a + 1];
            }
        }

        for(i = 0; i < N; ++i) {
            System.out.print(arr[i]);
        }

    }
}