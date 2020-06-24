package com.bj.c_forTest;

import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a,b;
		
		for(int i = 0; i < num; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(0 < a && a < 10 && 0 < b && b < 10) {
				System.out.println(a+b);
			}
		}
	}

}


//다른 사람이 푼 방법
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		for(int i = 0;i<A; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			System.out.println(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()));
		}
		
	}
	
}

*public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            String[] split = input.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            bw.write(a + b + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
        
    }
}
*
*class Main {
    public static void main(String args[]) throws Exception {
    	int T, A, B, result;
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        T = Integer.parseInt(br.readLine());
 
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            
            result = A+B;
 
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
*
*/