package basic_100question;

import java.util.Scanner;

public class no1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] sArr = sc.nextLine().split(":");

        System.out.println(Integer.valueOf(sArr[1]));
    }

    /**
     * 예전 풀이
     */
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        String a = sc.nextLine();
//        String [] arr = a.split("\\:");
//        int A = Integer.parseInt(arr[1]);
//
//        System.out.println(A);
//    }
}
