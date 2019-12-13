package chap03;
//이진검색

import java.util.Scanner;

public class BinSearch {
	static int binSearch(int[] a,int n, int key) {
		int pl = 0; //검색 범위의 첫 인덱스
		int pr = n - 1; //검색범위의 끝 인덱스
		
		do {
			int pc = (pl + pr)/2;//중앙 요소와 인덱스
			if(a[pc]== key)
				return pc;
			else if(a[pc] < key)
				pl = pc+1;//검색범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc-1;//검색범위를 앞쪽 절반으로 좁힘
		}while(pl <= pr);
		
		return -1;
	}
	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		System.out.print("요소수:");
		int num = stdln.nextInt();
		int[] x = new int[num];
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0]:");
		x[0]=stdln.nextInt();
		
		for(int i=1;i <num;i++) {
			do {
				System.out.print("x["+i+"]:");
				x[i] = stdln.nextInt();
			}while(x[i] < x[i-1]);//바로 앞요소 보다 작으면 다시 입력
		}
		System.out.print("검색할 값:");
		int ky = stdln.nextInt();
		
		int idx = binSearch(x,num,ky);
		if(idx == -1)
			System.out.println("그값의 요소가 없습니다.");
		else
			System.out.println(ky+"은 x["+idx+"]에 있습니다.");
	}
}
