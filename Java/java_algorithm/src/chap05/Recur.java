package chap05;

import java.util.Scanner;

class Recur{
    static void recur(int n){
        if(n>0){
            System.out.println("1>>>>");
            recur(n-1);
            System.out.println("2>>>>");
            System.out.println(n);
            System.out.println("3>>>>");
            recur(n-2);
            System.out.println("4>>>>");
        }
    }
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int x = stdln.nextInt();

        recur(x);
    }
}