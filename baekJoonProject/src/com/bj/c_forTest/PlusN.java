package com.bj.c_forTest;

import java.util.Scanner;

public class PlusN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		if(0 < num && num < 10001) {
			for(int i = 1; i < num+1; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
