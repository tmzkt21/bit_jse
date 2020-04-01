package com.jse.app;

import java.util.Random;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("0. 종료 "
					+ "1.가위바위보 "
					+ "2.주사위 홀짝 맞추기 게임"
					+ "3. 1부터 100까지의 합");
					
			
			int flag = scanner.nextInt();
			switch (flag) {
			case 0:
				System.out.println("종료");
				return;// returnmain 메소드를 끝냄 종료가된다
			case 1:
				
				game();
				break;
			case 2:
				switchDice();
				break;
			case 3:
				sum();
				break;
			}
		}
	}
	static void game() {
		System.out.println("가위1,바위2,보3, 을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();
		System.out.println("사용자의 값은 " + sum + " 입니다.");
		Random random = new Random();
		int zum = random.nextInt(3) + 1;
		System.out.println("컴퓨터의 값은 " + zum + " 입니다.");

		String result = "";

		if (sum == zum) {
			result = "무승부";
			System.out.println(result);
		}
		if (sum == 1) {
			if (zum == 2) {
				result = "컴퓨터 승리";
				System.out.println(result);
			} else if (zum == 3) {
				result = "사용자 승리";
				System.out.println(result);
			}

		} else if (sum == 2) {
			if (zum == 1) {
				result = "사용자 승리";
				System.out.println(result);

			} else if (zum == 3) {
				result = "컴퓨터 승리";
				System.out.println(result);
			}

		} else if (sum == 3) {
			result = "컴퓨터 승리";
			System.out.println(result);

			if (zum == 2) {
				result = "사용자 승리";
				System.out.println(result);
			}
			else if (zum == 1) {
				result = "컴퓨터 승리";
				System.out.println(result);

			}
		}
		
	}
	

	static void switchDice() {
		System.out.println("주사위 홀짝 맞추기 게임");
		System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println(String.format("사용자가 생성한 값: %s",expect));
		Random random = new Random();
		int dice = random.nextInt(6)+1;
		System.out.println(String.format("컴퓨터가 생성한 값: %d", dice));
		String result = "";
		switch (dice) {
		case 1:case 3:case 5:result = "홀";break;
		case 2:case 4:case 6:result = "짝";break;
		}
		System.out.println("컴퓨터의 결과: 짝");
		String result2 = "틀림";
		if (expect.equals(result)) {
			result2 = "맞음";
		}
		System.out.println(String.format("결과: %s", result2));
	}
	
	static void sum() {
		int sum =0;
		for(int a = 1; a <= 100; a++) {
			
			System.out.println(a);
			
			sum += a;
		}
		System.out.println(String.format("%d", sum));
		
}

}

//while(true) 무한loop