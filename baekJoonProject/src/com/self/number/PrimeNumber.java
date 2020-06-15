package com.self.number;

import java.util.Scanner;

public class PrimeNumber {
	public void primeNumber() {
		//소수구하기
		//1과 자기자신으로만 나누어 지는 수
		//특정 숫자를 입력받으면 그 수까지의 소수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		int primeNum = 0;
		boolean flag = true;
		int ctn = 0;
		
		for(int i = 2; i <= num; i++) { 
			flag = true;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				primeNum = i;
				ctn++;
				System.out.println(primeNum);
				
			}
		}
		System.out.println("갯수: " + ctn);
		
		
	}
}
