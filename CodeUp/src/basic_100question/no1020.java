package basic_100question;

import java.util.Scanner;

public class no1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] sArr = sc.nextLine().split("-");

        int first = Integer.valueOf(sArr[0]);
        int second = Integer.valueOf(sArr[1]);

        System.out.printf("%06d%06d", first, second);
    }

    /**
     * 예전 풀이법
     * 문자열로 받아서 그대로 출력
     */
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        String a = sc.next();
//        String[] arr = a.split("\\-");
//        String A = String.valueOf(arr[0]);
//        String B = String.valueOf(arr[1]);
//        System.out.printf(A+B);
//    }
}
