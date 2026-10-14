package randomTest;

import java.util.Random;
import java.util.Scanner;

public class RockGame {

	public static void main(String[] args) {
		// 가위, 바위, 보 게임
		
		Scanner sc = new Scanner(System.in); //게이머가 가위, 바위, 보 입력
		
		Random random = new Random();
		
		System.out.println("가위(0), 바위(1), 보(2) 중에 하나를 숫자로 입력하세요:");
		String userChoice = sc.nextLine(); //게이머가 입력 가위, 바위, 보 중 하나를 저장
		//0, 1, 2 중 하나가 저장
		int user = Integer.parseInt(userChoice); //유저가 선택한 0,1,2를 정수로 변환하여 저장
		
		int computer = random.nextInt(3); //0,1,2 중에 랜덤으로 하나를 컴퓨터 추출
		
		if(user == computer) { //비김
			System.out.println("비겼습니다!");
		} else if((user == 0 && computer == 2)||(user == 1 && computer == 0)||(user == 2 && computer == 1)) {
			//내가 가위를 선택했을때 이기는 경우 : 0, 2
			//내가 바위를 선택했을때 이기는 경우 : 1, 0
			//내가 보를 선택했을때 이기는 경우 : 2, 1
			System.out.println("이겼습니다!");
		} else {
			System.out.println("졌습니다!");
		}
		
		sc.close();

	}

}
