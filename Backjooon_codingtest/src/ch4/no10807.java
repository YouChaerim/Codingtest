package ch4;

import java.util.Scanner;

public class no10807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        int v;
        int count;
        for(v = 0; v < N; ++v) {
            count = sc.nextInt();
            arr[v] = count;
        }

        v = sc.nextInt();
        count = 0;

        for(int j = 0; j < N; ++j) {
            if (arr[j] == v) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
