package com.bj.c_forTest;

import java.util.Scanner;

public class ToN {

/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}*/
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}

}


/*다른방법!!
 * 
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 0; i--) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
 * */

	
