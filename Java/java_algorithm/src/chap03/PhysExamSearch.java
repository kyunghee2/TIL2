package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class PhysExamSearch {
	static class PhyscData {
		private String name;//이름
		private int height;//키
		private double vision;//시력
		
		public PhyscData(String name, int height, double vision) {
			super();
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		@Override
		public String toString() {
			return name + " " + height + " " + vision;
		}
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{

			@Override
			public int compare(PhyscData d1, PhyscData d2) {				
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height)? -1:0;
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		PhyscData[] x= {
				new PhyscData("홍길동",162,0.3),
				new PhyscData("김길동",171,0.7),
				new PhyscData("박길동",175,2.0),
				new PhyscData("이길동",158,1.3),
				new PhyscData("최길동",170,1.5),
				new PhyscData("안길동",168,1.2),
				new PhyscData("유길동",172,0.8),
			};
		System.out.print("몇 cm인 사람을 찾고 있나요? : ");
		int height =stdln.nextInt();
		int idx = Arrays.binarySearch(x, 
				new PhyscData("",height,0.0),//키가 height인 요소를
				PhyscData.HEIGHT_ORDER);//HEIGHT_ORDER에 의해 검색
		
		if(idx < 0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾는 데이터:"+x[idx]);
		}
			
	}
	
}
