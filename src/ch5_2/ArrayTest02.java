package ch5_2;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int[] scores = {90,85,75,80};   // 배열은 크기변경 불가
				
		//System.out.println(scores[0]);
		
		System.out.println(scores.length);
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		int[] arr1 = new int [10]; // 모든 칸이 0으로 초기화된 정수형 배열이 생성됨.
		
		for(int j=0;j<10;j++) {
			System.out.println(arr1[j]);
			
		}
		String[] arr2 = new String[5]; // 모든 칸이 null로 초기화된 문자열 배열이 생성됨.
		for(int j=0;j<5;j++) {
			System.out.println(arr2[j]);
		}
		double[] arr3 = new double[4]; // 모든 칸이 0으로 초기화된 실수형 배열이 생성됨.
		for(int j=0;j<4;j++) {
			System.out.println(arr3[j]);
		}
		boolean[] arr4 = new boolean[4]; // 모든 칸이 false로 초기화된 배열이 생성됨.
		for(int j=0;j<4;j++) {
			System.out.println(arr4[j]);
		}
		
	}

}
