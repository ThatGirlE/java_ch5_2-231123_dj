package ch5_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest03 {
	public static void main(String[] args) {
		
		int[] arr1 = new int[4];
		
		arr1[0] = 10;
		
		List list1 = new ArrayList(Arrays.asList(arr1));  // 리스트로 변경 방법
		
		list1.add(99); // apppend 기능
		
		//arr1 = list1.toArray(arr1); // 배열로 바꾸기(오류남. 아직안배워서 깊게 안들어감)
	}
}
