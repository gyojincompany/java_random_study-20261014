package randomTest;

import java.util.Random;

public class RandomTest01 {

	public static void main(String[] args) {
		//랜덤값->규칙이 없는 임의의 값
		
		//Math.random() 사용하기
		double randomNum1 = Math.random();
		//0~1 사이의 값만 실수로 랜덤으로 만들어줌(0과 1은 안나옴)
		//랜덤으로 숫자를 만들어서 randomNum1에 저장
		
		System.out.println(randomNum1);
		
		int randomNum2 = (int)(Math.random() * 10); //랜덤 정수
		//0~9까지의 정수만 랜덤으로 생성
		System.out.println(randomNum2);
		
		//1~10까지의 정수를 랜덤으로 생성		
		System.out.println(randomNum2+1);
		
		//1~6까지의 랜덤 정수->주사위
		int randomNum3 = (int)(Math.random() * 6) + 1;
		System.out.println("주사위 던진 수:" + randomNum3);
		
		//1~45사이의 랜덤 수
		int randomNum4 = (int)(Math.random() * 45) + 1;
		System.out.println("로또번호:" + randomNum4);
		
		Random random = new Random();
		int random1 = random.nextInt(10)+1; //1~10사이의 수중 랜덤수가 반환
		System.out.println("Random클래스 랜덤숫자(1~10):" + random1);
		int random2 = random.nextInt(45)+1; //1~45사이의 수중 랜덤수가 반환
		System.out.println("Random클래스 랜덤숫자(1~45):" + random2);
		
	}

}
