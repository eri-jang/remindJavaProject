package com.bj.a_calcurator.day02;

import java.util.Scanner;

public class cal3 {
	//내가푼거
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String number = Integer.toString(num2);
		
		
		int [] nrr = new int[number.length()];
		
		int result = 0;
		
		for(int i = 0; i < number.length(); i++) {
			nrr[i] = number.charAt(i) - '0';
			
			//System.out.println("nrr[i] : " + nrr[i]);
			
		}
		
		//System.out.println("nrr.lenght: " + nrr.length);
		for(int i = nrr.length-1; i >= 0; i--) {
			result = num1 * nrr[i];
			System.out.println(result);
		}
		
		System.out.println(num1*num2);
				
				
	}
	
	//다른사람이 푼거
	 public void ex2() {
		 Scanner sc = new Scanner(System.in);
		 
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		 int firstNum = num2 / 100;
		 int midNum = (num2 / 10) % 10;
		 int lastNum = num2 % 10;
		 
		 System.out.println("firstNum : "  + firstNum);
		 System.out.println("midNum : " + midNum);
		 System.out.println("lastNum : " + lastNum);
		 
		 System.out.println(num1 * lastNum);
		 System.out.println(num1 * midNum);
		 System.out.println(num1 * firstNum);
		 System.out.println(num1 * num2);
		 
	 }

}
