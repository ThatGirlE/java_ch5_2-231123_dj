package ch5_2;

public class UpgradeFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4};

		//		int[] arr2;
//		arr2= {1,2,3,4}; // 에러발생 (크기선택이 없음)
		
		
		int sum=0;
//		for(int i=0;i<arr1.length;i++) {
//			sum = sum + arr1[i];
//		}
		
		boolean[] arrBool = {false,true,true};
		boolean[] arrBool2 = new boolean[3]; // 0으로 초기화 false,false,false
		
		
		//파이썬 문법 : for i in arr1:
		
		for(int value:arr1) {    // 향상된 for문
			sum = sum + value;
		}
		
		System.out.println(sum);
	}

}
