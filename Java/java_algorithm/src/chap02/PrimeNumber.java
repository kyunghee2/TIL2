package chap02;

//소수의 나열
//소수는 자신과 1 이외의 정수로 나누어 떨어지지 않는 정수
public class PrimeNumber {
	public static void main(String[] args) {
		int counter=0;//나눗셈의 횟수
		
		for(int n =2; n <= 1000; n++) {
			int i;
			for(i=2;i<n;i++) {
				counter++;
				if(n % i ==0)//나누어 떨어지면 소수가 아님
					break;
			}
			if(n == i)
				System.out.println(n);
		}
		
		System.out.println("나눗셈을 수행한 횟수:"+counter);
	}
}
