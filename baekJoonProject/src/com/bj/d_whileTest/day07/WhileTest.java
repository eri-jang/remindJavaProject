package com.bj.d_whileTest.day07;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		do {
			 a = sc.nextInt();
			 b = sc.nextInt();
			 if(0 != a && 0 != b) {
				 System.out.println(a+b);
			 }
		}
		while(0 != a && 0 != b);
			return;
		
		
	}

}
