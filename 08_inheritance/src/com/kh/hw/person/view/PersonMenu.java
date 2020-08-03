package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		int menuNum;
		int[] arr = pc.personCount();
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + arr[0] + "입니다");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + arr[1] + "입니다");
		System.out.println();
		do {
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}while(menuNum != 9);
	}
	
	public void studentMenu() {
		int menuNum;
		do {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				 insertStudent();
				 break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}while(menuNum != 9);
	}
	
	
	public void employeeMenu() {
		int menuNum;
		do {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				 insertEmployee();
				 break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}while(menuNum != 9);
	}
	
	
	public void insertStudent() {
		
	}
	
	public void printStudent(){ 
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
