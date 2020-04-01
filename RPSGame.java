package com.jse.app;
import java.util.Scanner;
import java.util.Random;

public class RPSGame {
	public static void main(String[] args) {
		game();
	}
	static void game() {
		System.out.println("가위1,바위2,보3, 을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();
		System.out.println("사용자의 값은 "+sum+" 입니다.");
		Random random = new Random();
		int zum = random.nextInt(3)+1;
		System.out.println("컴퓨터의 값은 "+zum+" 입니다.");
		String result ="";
		if(zum==2) {
			result="사용자승리";
			
		}else if(zum==3) {
			result="컴퓨터 승리";
		}
		System.out.println("컴퓨터 승리");
	}

}
