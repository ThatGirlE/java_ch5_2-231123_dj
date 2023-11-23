package ch5_3;

public class EnumTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today;  // 열거타입 변수 선언
		Week nextDay = Week.FRIDAY;
		
		today = Week.THRUSDAY;
		
		Score score1, score2;
		score1 = Score.A;
		score2 = Score.B;
		
		
		int s1 = 84;
		if(s1>=90) {
			System.out.println(score1);
		}else if(s1>=80) {
			System.out.println(score2);
		}
		
		
		
	}

}
