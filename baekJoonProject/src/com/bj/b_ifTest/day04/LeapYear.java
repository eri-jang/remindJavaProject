package com.bj.b_ifTest.day04;

import java.util.Scanner;

public class LeapYear {

	public void test() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0 && num < 4001) {
			
			if(num % 4 == 0 && num % 400 == 0) {
				System.out.println(num + "�� �����Դϴ�.");
				System.out.println("1");
			} else if(num % 4 == 0 && num % 100 != 0) {
				System.out.println("1");
			} else if(num % 400 == 0 && num % 100 != 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println("�����ʰ��� �ٽ� �Է� �� ��");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num % 4 == 0) {
			if(num % 400 == 0) {
				System.out.println("1");
			} else if(num % 100 == 0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		} else {
			System.out.println("0");
		}
	}

}
