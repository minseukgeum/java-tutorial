package com.kh.operator;

public class B_InDecrease {
	public void method1() {
		// 전위 증감 연산자
		int num1 = 10;
		System.out.println("전위 증감 연산자 적용 전 : " + num1);
		System.out.println("++num1을 1회 수행 후 결과 : " + (++num1));
		System.out.println("++num1을 2회 수행 후 결과 : " + (++num1));
		System.out.println("++num1을 3회 수행 후 결과 : " + (++num1));
		System.out.println("++num1을 4회 수행 후 결과 : " + (++num1));
		System.out.println("++num1을 5회 수행 후 결과 : " + (++num1));
		System.out.println("전위 증감 연산 수행 후 num1의 값 : " + num1);
		// 후위 증감 연산자
	}
}
