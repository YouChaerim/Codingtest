package basic_100question;

import java.util.Scanner;

public class no1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] sArr = sc.nextLine().split("");

        for (int i=0; i<sArr.length; i++){
            System.out.printf("'%s'\n", sArr[i]);
        }
    }

    /**
     * 예전 풀이
     */
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        String a = sc.next();
//
//        for(int i=0; i<a.length(); i++){
//            System.out.println("\'" + a.charAt(i) + "\'");
//        };
//    }
}
