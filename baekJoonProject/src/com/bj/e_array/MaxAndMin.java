package com.bj.e_array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []nrr = new int[n];
		
		for(int i = 0; i < n; i++) {
			nrr[i] = sc.nextInt();
			
		}
		
		Arrays.sort(nrr);
		System.out.println(nrr[0] + " " + nrr[n-1]);
	}
}

