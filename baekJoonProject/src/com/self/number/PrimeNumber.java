package com.self.number;

import java.util.Scanner;

public class PrimeNumber {
	public void primeNumber() {
		//�Ҽ����ϱ�
		//1�� �ڱ��ڽ����θ� ������ ���� ��
		//Ư�� ���ڸ� �Է¹����� �� �������� �Ҽ� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
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
		System.out.println("����: " + ctn);
		
		
	}
}
