package randomTest;

import java.util.Random;

public class LottoGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		
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

	}

}
