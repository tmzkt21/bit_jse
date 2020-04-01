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
		main(null);
	}
}
