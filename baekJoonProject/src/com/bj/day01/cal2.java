package com.bj.day01;

import java.util.Scanner;

public class cal2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a+b)%c + "\n" +
							((a%c) + (b%c))%c + "\n" +
							(a*b)%c + "\n" + 
							((a%c) * (b%c))%c);
		
				
	}
}
