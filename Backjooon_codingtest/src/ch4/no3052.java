package ch4;

import java.util.Scanner;

public class no3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[10];

        int count;
        for(int i = 0; i < 10; ++i) {
            count = sc.nextInt();
            result[i] = count % 42;
        }

        count = 0;

        for(int i = 0; i < 10; ++i) {
            boolean bl = false;

            for(int j = i + 1; j < 10; ++j) {
                if (result[i] == result[j]) {
                    bl = true;
                    break;
                }
            }

            if (!bl) {
                ++count;
            }
        }

        System.out.println(count);
    }
}