package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {
	public void input1() {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("원하는 값을 입력하세요: ");
//		String value = sc.next();
//		System.out.println("내가 입력한 값: "+value);
		
		System.out.print("이름을 입력하세요: ");
//		String name = sc.next();
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요(소수점 첫째자리까지) :");
		double height = sc.nextDouble();
		System.out.println(name + "님은 "+ age + "세이며, 키는" +height+"cm입니다");
	}
	
	public void input2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요: ");
//		int age = sc.nextInt();
//		
//		System.out.print("주소를 입력하세요: ");
//		String address = sc.nextLine();
		
		// 1. 주소를 next()로 받기
//		String address = sc.next();
		// next() : 띄어쓰기 입력 불가, 띄어쓰기를 구분자로 인식
		
		// 2. 나이를 받는 nextInt와 주소를 받는 nextLine() 사이에 nextLine() 추가
//		sc.nextLine();
//		String address = sc.nextLine();
		
		// 3. 나이를 받을 때 엔터가 남지 않도록 nextLine()을 쓴 후 파싱(String 자료형을 다른 자료형으로 변경)하기
//		int age = Integer.parseInt(sc.nextLine());
		String ageStr = sc.nextLine();
		int age = Integer.parseInt(ageStr);
		System.out.print("주소를 입력하세요: ");
	
		String address = sc.nextLine();
		System.out.println(name + "님은 "+age+"세이며, 사는 곳은 " + address + "입니다.");
		
		System.out.print("아참! 당신의 성별은 무엇인가요?(M/F) : ");
		String genderStr = sc.nextLine();
		char gender = genderStr.charAt(0);
		System.out.println("제 성별은"+gender+"입니다");
	}
}
