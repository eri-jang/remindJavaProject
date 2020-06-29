package com.bj.b_ifTest;

import java.util.Scanner;

public class XandY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		} else if(x < 0 && y > 0) {
			System.out.println("2");
		} else if(x < 0 && y < 0) {
			System.out.println("3");
		} else {
			System.out.println("4");
		}
	}

}

/*
 * 다른방법
 * public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x>0){
            if(y>0){
                System.out.println(1);
            }else{
                System.out.println(4);
            }
        }else{
            if(y>0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
    }
}
 * */
 