package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// ���� ���� : �迭�� �ּҸ� ����
	// ���� ���� : ���ο� �迭�� ���� ���� ���� �� ����
	
	
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr; //���� ����
		
		for(int i = 0; i<originArr.length; ++i) {
			System.out.print(originArr[i] + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i<copyArr.length; ++i) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		
		originArr[0] = 99;
		
		
		for(int i = 0; i<originArr.length; ++i) {
			System.out.print(originArr[i] + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i<copyArr.length; ++i) {
			System.out.print(copyArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("originArr�� �ּ� : " + originArr);
		System.out.println("copyArr�� �ּ� : " + copyArr);
	}
	
	
	
	
	public void method2() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[5];
		
		// 1. for���� �̿��� ����
		for(int i =0; i<originArr.length; ++i) {
			copyArr[i] = originArr[i];
			
		}
		
		for(int i = 0; i<originArr.length; ++i) {
			System.out.print(originArr[i] + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i<copyArr.length; ++i) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		originArr[0] = 99;
		
		for(int i = 0; i<originArr.length; ++i) {
			System.out.print(originArr[i] + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i<copyArr.length; ++i) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("originArr�� �ּ� : " + originArr);
		System.out.println("copyArr�� �ּ� : " + copyArr);
	}
	
	public void method3() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("=== ���� �� ===");
		for(int i = 0; i<originArr.length; ++i) {
			System.out.print(originArr[i] + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i<copyArr.length; ++i) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		// 2.SystemŬ������ arrayCopy() �޼ҵ带 �̿��� ����
								//�Ű�����(����) : �ش� �޼ҵ忡 �� ����
//		System.arraycopy(src, srcPos, dest, destPos, length);
//				src		 : ���� �迭
//				srcPos 	 : ���� �迭���� ���縦 ������ ��ġ
//				dest	 : ���� �迭
//				destPost : ���� �迭���� �ٿ��ֱ⸦ ������ ��ġ
// 				length 	 : ���� ����
		
		//originArr�迭�� ��� �����͸� copyArr�� �����ϴµ�
		// copyArr�� 3��° �ε������ʹ� �ٿ��ְ� ����
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		System.out.println("=== ���� �� ===");
		for(int i = 0; i<originArr.length; ++i) {
			System.out.print(originArr[i] + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i<copyArr.length; ++i) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
	}
	
	
	public void method4() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("=== ���� �� ===");
		for(int i = 0; i<originArr.length; ++i) {
			System.out.print(originArr[i] + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i<copyArr.length; ++i) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		// 3. ArraysŬ������ copyOf() �޼ҵ� �̿�
		//Arrays.copyOf(original, newLength);
		//			original  : ���� �迭
		//			newLength :	���ο� ����
		copyArr = Arrays.copyOf(originArr, originArr.length);
		
		System.out.println("=== ���� �� ===");
		for(int i = 0; i<originArr.length; ++i) {
			System.out.print(originArr[i] + " ");
			
		}
		System.out.println();
		
		for(int i = 0; i<copyArr.length; ++i) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
	}
	
	
	
	
}