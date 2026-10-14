package randomTest;

import java.util.Random;
import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하시는 로또번호 게임 갯수를 입력하세요 :");
		int gameCount = sc.nextInt();		
		int count = 1;
		
		while(gameCount >= count) {
			count++;
			
			int[] lottoNumbers = new int[6]; //로또번호 6개가 저장될 정수 배열
			
			for(int i=0;i<6;i++) { //i=0~5
				lottoNumbers[i] = random.nextInt(45)+1; //1~45사이의 수 중 랜덤 정수가 추출
				//중복검사(이미 뽑은 번호가 같은 번호가 나오면 다시 뽑기)
				for(int j=0;j<i;j++) {
					if(lottoNumbers[i] == lottoNumbers[j]) { //참이면 중복번호가 발생
						i--; //중복이 발생했으므로 현재 위치인 i를 다시 뽑기 위해 하나 줄여줌
						break;
					}
				}
			}
			
	//		lottoNumbers[0] = random.nextInt(45)+1;
	//		lottoNumbers[1] = random.nextInt(45)+1;
	//		lottoNumbers[2] = random.nextInt(45)+1;
	//		lottoNumbers[3] = random.nextInt(45)+1;
	//		lottoNumbers[4] = random.nextInt(45)+1;
	//		lottoNumbers[5] = random.nextInt(45)+1;
			
			for(int lottoNumber:lottoNumbers) {
				System.out.print("["+lottoNumber+"]");
			}
			System.out.println(); //1게임 출력 후 다음줄 내려주기
		}
	}

}
