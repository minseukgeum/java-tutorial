package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println("str1과 str2의 주소는 같은가? : " + (str1 == str2));
		System.out.println("str1과 str3의 주소는 같은가? : " + (str1 == str3));
		System.out.println();
		// hashCode() //오브젝트에 있는 메소드
		// equals 를 통해 같은 값이 나오면 해시값도 같다
		System.out.println("str1의 hashcode : " + str1.hashCode());
		System.out.println("str2의 hashcode : " + str2.hashCode());
		System.out.println("str3의 hashcode : " + str3.hashCode());
		System.out.println();
		//System클래스에 identityHashCode()
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
		System.out.println();
		str2 += "oracle";
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		System.out.println();
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
	}
	public void method2() {
		// StringBuffer
		// String을 이용해서 어떤 문자열 작업을 할 때 String클래스 객체 생성을 통해서 하거나 리터럴로 작업했었음
		// 계속해서 문자열 값을 변경해야하는 경우 String클래스의 특징인 불변 때문에 
		// 값이 새로 생기고 참조 위치만 바꿔주기 때문에 가비지컬렉터가 계속 지워야한다는 단점이 있음
		// 변경이 적고 읽기만 많은 경우에는 불변 클래스인 String클래스가 더 용이
		
		// 변경해야하는 값이 많은 경우에는 StringBuffer 나 StringBuilder로 하는게 나음
		// StringBuffer나 StringBuilder는 변겨오가 저장을 위한 메모리 공간(버퍼)을 내부에 지니는데
		// 처음에는 16개의 문자를 저장할 수 있는 버퍼가 생성되고 문자가 저장됨에 따라 자동으로 증가함
		// 초기 버퍼 크기를 지정할 수도 있고 문자열의 길이보다 16개의 문자를 더 저장할 수 있음
		// 두 클래스는 다 동일하지만 동기화가 되느냐 안되느냐의 차이만 있음(쓰레드 safe)
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어있는 실제 값의 길이 : " + buffer1.length());
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제 값의 길이 : " + buffer2.length());
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity());
		System.out.println("buffer3에 들어있는 실제 값의 길이 : " + buffer3.length());
		System.out.println();
		
		System.out.println("buffer3의 실주소값: " + System.identityHashCode(buffer3));
		buffer3.append("abc");
		System.out.println("abc 추가 후의 buffer3 : " + buffer3);
		System.out.println("abc 추가 후의 buffer3의 용량 : " +buffer3.capacity());
		System.out.println("abc 추가 후의 buffer3의 길이 " + buffer3.length());
		
		buffer3.append("def");
		System.out.println("abc 추가 후의 buffer3 : " + buffer3);
		System.out.println("abc 추가 후의 buffer3의 용량 : " +buffer3.capacity());
		System.out.println("abc 추가 후의 buffer3의 길이 " + buffer3.length());
		
		// insert(int offset, String str) 반환값 : StringBuffer
		buffer3.insert(2, "zzz");
		System.out.println("zzz 추가 후의 buffer3 : " + buffer3);
		System.out.println("zzz 추가 후의 buffer3의 용량 : " +buffer3.capacity());
		System.out.println("zzz 추가 후의 buffer3의 길이 " + buffer3.length());
		
		buffer3.reverse();
		System.out.println("reverse 추가 후의 buffer3 : " + buffer3);
		
		//delete(int start, int end)반환형 StringBuffer
		// start <=index <end   시작값이상 끝값미만
		buffer3.delete(2,5);
		System.out.println("delete 후의 buffer3 : " + buffer3);
		
		
		StringBuffer sb = new StringBuffer("abc");
		sb = sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
		System.out.println(sb);
	}
	
	public void method3() {
		String str = "Hello World";
		
		// 1.charAt()
		
		// 2.concat() 매개변수 붙여주는 역할
		String concatStr = str.concat("!!!");
		System.out.println(concatStr);
		str += "!!!";
		System.out.println(str);
		
		// 3.equals()
		
		// 4.substring(int beginIndex) 매개변수 이후의 인덱스 이후부터 출력
		//			  (int beginIndex, int endIndex)
		System.out.println("str.substring(6) : " + str.substring(1));
		
		// 5. toUpperCase, toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		// 6.equalsIgnoreCase   //대소문자 구분을 없앤 후 비교
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println(str2.equalsIgnoreCase(str3));
		
		// 7.trim() 앞뒤에 있는 빈 공간을 제거해주는 메소드
		String str4 = "     Java";
		String str5 = "Java       ";
		String str6 = "     ja    va";
		
		System.out.println(str4 + " : " + str4.trim());
		System.out.println(str4 + " : " + str4.trim() + "!");
		System.out.println(str6 + " : " + str6.trim() + "!");
		
		//8.split()
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] strArr = splitStr.split(", ");
		for(int i=0; i<strArr.length; ++i) {
			System.out.println(strArr[i]);
		}
		
		for(String elem : strArr) {
			System.out.println(elem);
		}
	}
	
	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer st = new StringTokenizer(str, ", ");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) { //그 다음에 토큰이 있다면 그 토큰을 나에게 출력해줘
			System.out.println(st.nextToken());
		}
		
		String str2 = "Apple,Banana_Cream*Dessert#Egg Fruit";
		StringTokenizer st2 = new StringTokenizer(str2, ",_*# ");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
