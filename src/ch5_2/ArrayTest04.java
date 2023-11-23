package ch5_2;

import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scores = new int[2][3]; // 1차원 배열 3개짜리 2개생기는것
		//int[][][] scores3 = new int[2][3][4];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(scores[i][j]);
			}
		}
		
		System.out.println(scores[0].length);
		
		int[] arr1 = {1,2,3};
		
		System.out.println(Arrays.toString(arr1));  // . dot 연산자, toString-> 1차원 배열의 내용 출력
		System.out.println(Arrays.toString(scores[0])); // 2차원 배열 중 특정 행의 내용 출력  
		
		System.out.println(Arrays.deepToString(scores)); // 2차원 배열 (잘 쓸일은 없다)

	}

}
