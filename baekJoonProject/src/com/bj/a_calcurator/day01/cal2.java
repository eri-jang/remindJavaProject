package com.bj.a_calcurator.day01;

import java.util.Scanner;

public class cal2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a+b)%c + "\n" +
							((a%c) + (b%c))%c + "\n" +
							(a*b)%c + "\n" + 
							((a%c) * (b%c))%c);
		
				
	}
}
