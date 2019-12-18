package chap05;

import java.util.Scanner;
//유클리드 호제법으로 최대공약수,최소공배수 구하기
public class EuclidGCD{
    static int gcd(int x, int y){
        if(y==0)
            return x;
        else
            return gcd(y,x%y);

    }
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요:");int x= stdln.nextInt();
        System.out.print("정수를 입력하세요:");int y= stdln.nextInt();

        int gcd = gcd(x,y);
        System.out.println("최대공약수는 "+gcd+" 입니다.");
        System.out.println("최소공배수는 "+(x*y)/gcd+" 입니다.");
    }
}