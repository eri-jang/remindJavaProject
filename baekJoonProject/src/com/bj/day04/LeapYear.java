package com.bj.day04;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
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

}