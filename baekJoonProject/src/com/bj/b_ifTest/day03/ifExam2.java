package com.bj.b_ifTest.day03;

import java.util.Scanner;

public class ifExam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		if(score >= 0 && score <= 100) {
			
			if(score < 60) {
				System.out.println("F");
				
			} else if (score >= 60 && score < 70) {
				System.out.println("D");
				
			} else if (score >= 70 && score < 80) {
				System.out.println("C");
			} else if (score >= 80 && score < 90) {
				System.out.println("B");
				
			} else {
				System.out.println("A");
			}
			
		} else {
			System.out.println("다시입력ㄱㄱ");
		}
	}

}
