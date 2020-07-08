package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	public void method() {
		// 입력한 정수가 양수인지 아닌지 판별
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : (num < 0 ? "양수가 아니다" : "0이다");
		System.out.println(num + " : " + result);
	}
	public void method2() {
		//입력한 정수가 홀수인지 짝수인지 판별
		//짝수면 , 짝수입니다
		//홀수면, 홀수입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수입니다" : "홀수입니다";
		System.out.print(num + "은(는)" + result);
	}
}
