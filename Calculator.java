package com.jse.app;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		// 첫번째 수 입력
		// 두번쨰 수 입력
		// 두수의 합은 ?
		
		calculat();
		
		
		
	} 
	static void calculat() {
		System.out.println("첫번째 수 입력");
		Scanner scanner = new Scanner(System.in);// in=클래스변수 System=클래스
		int a = scanner.nextInt();
		System.out.println("두번쨰 수 입력");
		//Scanner scanner2 = new Scanner(System.in);
		int b = scanner.nextInt();
		System.out.println("세번쨰수 입력");
		//Scanner scanner3 = new Scanner(System.in);
		int c = scanner.nextInt();
		System.out.println("네번쨰 수 입력");
		//Scanner scanner4 = new Scanner(System.in);
		int d = scanner.nextInt();
		int e = a + b + c + d; 
		
		System.out.println("두수의 합은 ?"+ e);
	//System.out 클래스변수
		//
		
	}
}
