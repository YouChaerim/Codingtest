package basic_100question;

import java.util.Scanner;

public class no1019 {
    /**
     * 풀이 1. 문자열로 입력받아 그대로 출력하기
     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.nextLine();
//
//        System.out.println(str);
//    }

    /**
     * 풀이 2. 배열과 구분자를 사용해 나눠서 출력하기
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] sArr = sc.nextLine().split("\\.");

        /**
         * valueOf()
         * : () 괄호 안의 해당 객체를  String으로 변환시키는 역할을 함.
         * toString()도 사용 가능함 - object가 null인 경우 toString()은 NullPointerException을 발생시키지만 valueOf는 "null"이라는 문자열로 처리함
         * Integer.valueOf : 문자열을 정수로 변환해주는 메소드, 문자열의 값을 정수형으로 변환한 뒤 참조 자료형인 Integer 객체로 만들어서 반환 (cf. Integer.parseInt() : 결과값을 기본 자료형인 int로 반환)
         */
        int Y = Integer.valueOf(sArr[0]);
        int H = Integer.valueOf(sArr[1]);
        int M = Integer.valueOf(sArr[2]);

        System.out.printf("%04d.%02d.%02d", Y, H, M);


    }
}
