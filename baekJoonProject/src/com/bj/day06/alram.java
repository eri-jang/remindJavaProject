package com.bj.day06;

import java.util.Scanner;

public class alram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		
		if(hh >= 0 && hh <= 23) {
			if(mm >= 0 && mm <= 59) {
				System.out.println("�Է½ð� : " + hh + " " + mm);
				if(mm > 45) {
					mm = mm - 45;
					System.out.println(" �ٲ�ð�1 : " + hh + " " + mm);
				} else {
					hh = hh -1;
					mm = mm + 60 - 45;
					System.out.println("�ٲ�ð�2 : " + hh + " " + mm);
				}
				
			}
		} 
		
	}
}
