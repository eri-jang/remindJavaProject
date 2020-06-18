package com.bj.day05;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num > 0 && num < 10) {
			for(int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
		}
	}

}
