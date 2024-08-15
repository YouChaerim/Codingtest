package basic_100question;

import java.util.Scanner;

public class no1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] sArr = sc.nextLine().split("\\.");

        int a = Integer.valueOf(sArr[0]);
        int b = Integer.valueOf(sArr[1]);

        System.out.printf("%d\n%d", a, b);
    }

    /**
     * 예전 풀이
     */
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        String A = sc.nextLine();
//ㅐ
//        String [] arr = A.split("\\.");
//
//        System.out.println(arr[0] + '\n' + arr[1]);
//    }
}
