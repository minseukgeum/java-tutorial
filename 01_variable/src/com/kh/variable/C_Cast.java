package com.kh.variable;

public class C_Cast {
	public void rule1() {
		int num = 'a';
		//int 는 4byte <- char은 2byte : 자동형변환           	2byte -> 4byte
		System.out.println("num : " + num);
		
		char c = 65; //리터럴이기때문에 가능 char의 범위만 안 벗어나면 된다
		//2byte   4byte
		System.out.println("c : " + c);
		
//		char c2 = num; //int형 변수이기 때문에 에러가 생긴다. 강제형변환 필요
		char c2 = (char)num;
		System.out.println("c2 : " + c2);

		//위에 char c = 65가 오류가 안나는 이유는 그 값 자체 즉 char형의 범위
		//안에 포함되어있기 때문에 오류가 생기지 않는다. 
		int num2 = -97;
		char c3 = (char)num2;
		System.out.println("c3 : " + c3);
		//char에는 음수가 없기 때문에 ?가 나온다. 
	}
	public void rule2() {
		int iNum = 10;
		long lNum = 100L;
		
//		int sum = iNum + lNum;
		 //int     int   long
		//(자동형변환)long + long 큰걸로 자동형변환
		
		// 방법 1. 수행결과를 int로 강제 형변환
		int sum1 = (int)(iNum + lNum);
		System.out.println("sum1 : " + sum1);
		
		// 방법 2. long형의 값을 int 로 강제 형변환
		int sum2 = iNum + (int)lNum;
		System.out.println("sum2 : " + sum2);
		
		// 방법 3. 결과 자료형을 long으로 받기
		long sum3 = iNum + lNum;
		System.out.println("sum3 : " + sum3);
	}
}
