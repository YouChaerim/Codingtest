package basic_100question;

import java.util.Scanner;

public class no1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] sArr = sc.nextLine().split("");

        System.out.println("[" + Integer.valueOf(sArr[0]) * 10000 + "]");
        System.out.println("[" + Integer.valueOf(sArr[1]) * 1000 + "]");
        System.out.println("[" + Integer.valueOf(sArr[2]) * 100 + "]");
        System.out.println("[" + Integer.valueOf(sArr[3]) * 10 + "]");
        System.out.println("[" + Integer.valueOf(sArr[4]) + "]");
    }

    /**
     * 예전 풀이
     */
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int A = sc.nextInt();
//
//        int B = A/10000;
//        int C = (A%10000)/1000;
//        int D = (A%1000)/100;
//        int E = (A%100)/10;
//        int F = A%10;
//
//        System.out.printf("[" + B + "0000]\n");
//        System.out.printf("[" + C + "000]\n");
//        System.out.printf("[" + D + "00]\n");
//        System.out.printf("[" + E + "0]\n");
//        System.out.printf("[" + F + "]");
//    }
}
