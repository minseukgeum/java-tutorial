package com.kh.run;

import com.kh.variable.C_Cast;

public class Run { //실행 클래스
	public static void main(String[] args) {
//		//import 방법 1
//		com.kh.variable.A_Variable av = new com.kh.variable.A_Variable();
//		//기능 클래스(A_Variable) 알맹이 만들기  기능 클래스에 있는 메소드를 사용할 수 있게 해주는 코드
//		//import 방법 2
//		A_Variable av = new A_Variable();

//		av.declareVariable();
//		av.initVariable();
//		B_Constant bc = new B_Constant(); //import 단축키 ctrl + shift + O(알파벳)
//		bc.finalConstant();
		C_Cast cc = new C_Cast();
//		cc.rule1();
		cc.rule2();
	}
}
