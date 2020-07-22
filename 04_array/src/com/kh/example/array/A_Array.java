package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
	// �迭�� ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
	// ����� ������ �ε����� �����Ǵµ� �ε����� 0���� ����
	
	//�迭 ����
	//		�ڷ���[] �迭��;
	//		�ڷ��� �迭��[];
	//�迭 �Ҵ�
	//		�ڷ���[] �迭�� = new �ڷ���[�迭ũ��];
	//		�ڷ��� �迭��[] = new �ڷ���[�迭ũ��];
	//		new �����ڸ� ���� Heap������ �迭 ũ�⸸ŭ ���� ����
	//		�����Ǵ� ���� �� ������ ���� �ּ� ���� �����
	//		�ּ� ���� stack�� �ִ� �迭�� ������ ���� ���� ��(�����ϰ� ����)
	//�迭 �ʱ�ȭ
	//		1) �ε��� �̿�(�ε����� zero-based)
	//			�迭��[�ε��� ��ȣ] = ��;
	//		2) for�� �̿�(��Ģ�� ���� ���� ��� ����)
	//			for(int i = 0; i arr.length; i++){
	//				�迭��[i] = ��;
	//			}
	//		3) ����� ���ÿ� �ʱ�ȭ
	//			�ڷ���[] �迭�� = {��};
	//			�ڷ���[] �迭�� = new �ڷ���[]{��};
	
	public void method1() {
		// int�ڷ����� ���� �� �ִ� 9��¥���� arr �迭 ����
		int[] arr = new int[9]; //�����ϸ鼭 �Ҵ�
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
//		arr[9] = 100; ArrayIndexOutOfBoundsException
		
		for(int i = 0; i < 9; ++i) {
			System.out.println(arr[i] + " ");
		}
		
		for(int i = 0; i < 9; ++i) {
			arr[i] = 10 * (i + 1);
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void method2() {
		int[] iArr; //�迭 ����
		iArr = new int[5]; //�迭 �Ҵ�
		System.out.println("iArr : " + iArr);
		
		for(int i = 0; i<iArr.length; ++i) {
			System.out.println(iArr[i] + " "); //heap������ ������ ����� �Ҵ��� ���� �ʰ� ����� �ϸ� �� �ڷ����� �⺻���� ��µȴ�.
		}
		
		System.out.println();
		
		// double�� �� �� �ִ� 30ĭ¥�� dArr�迭 ����
		double[] dArr = new double[30];
		System.out.println("ó������ ���� dArr�� ũ�� : " + dArr.length);
		System.out.println("ó������ ���� dArr�� �ּ� : " + dArr);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �迭 ũ�� : ");
		int arrSize = sc.nextInt();
		dArr = new double[arrSize];
		System.out.println("ũ�� �ٲ� dArr�� ũ�� : " + dArr.length);
		System.out.println("ũ�� �ٲ� dArr�� �ּ� : " + dArr);
		
		//dArr ����
		dArr = null; //������ �ڷ����̱� ������ null ���� �⺻���̴�.
		
		System.out.println();
		
		char[] cArr = {'a', 'b', 'c'};
		char[] cArr2 = new char[] {'d', 'e', 'f'};
		
		for(int i = 0; i<cArr.length; ++i) {
			System.out.print(cArr[i] + " ");
			if(i == cArr.length-1) {
				System.out.println();
			}
		}
		for(int i = 0; i<cArr2.length; ++i) {
			System.out.print(cArr2[i] + " ");
		}
	}
}