package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodController {
	// 매개변수 유무와 반환 값 유무에 따른 구분
	// 1. 매개변수 없고 반환 값 없는 메소드
	public void method1() {
		// void = 반환값  x
		// 메소드 내용만 수행 후 아무 값도 반환하지 않고(리턴 값 없이) 
		// 호출한 메소드로 돌아감
		System.out.println("매개변수와 반환 값 둘 다 없는 메소드입니다.");
	}
	// 2. 매개변수 없고 반환 값 있는 메소드
	public int method2() {
		int i = 0 ;
		return i;
	}
	// 3. 매개변수 있고 반환 값 없는 메소드
	public void method3(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}
	// 4. 매개변수 있고 반환 값 있는 메소드
	public int method4(int a, int b) {
		int result = a+b;
		return result;
	}
	
	//반환 값이 배열인 경우
	public int[] method5() {
		int[] iArr = {1, 2, 3, 4, 5};
		System.out.println("MethodController iArr : " + iArr);
		
		for(int i =0; i<iArr.length; ++i) {
			iArr[i] *= 10;
		}
		return iArr;
	}
	
	//반환 값이 클래스인 경우
	public User method6() {
		User user = new User("user01", "pass01", "홍길동");
		System.out.println("MethodController user : " + user);
		
		return user;
	}
	
	
}
