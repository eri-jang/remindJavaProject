package com.bj.c_forTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PlusA {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= t; i++) {
			String num = br.readLine();
			String []nrr = num.split(" ");
			
			int a = Integer.parseInt(nrr[0]);
			int b = Integer.parseInt(nrr[1]);
			
			int sum = a + b;
			
			bw.write("Case #" + i + ": " + sum + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
