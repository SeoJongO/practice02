package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double result = 0;
		double num = sc.nextDouble();
		
		if (num>=0 && num<=1000) {
			result = 0.09*num;
		}
		else if (num>1000 && num<=4000) {
			result = 1000*0.09 + 0.18*(num-1000);
			System.out.println("소득세는: "+result+"원 입니다.");
		}
		else if (num>4000 && num<=4000) {
			result = 1000*0.09 + 3000*0.18 + 0.27*(num-4000);
			System.out.println("소득세는: "+result+"원 입니다.");
		}
		else if (num>=8000) {
			result = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(num-8000);
			System.out.println("소득세는: "+result+"원 입니다.");
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		sc.close();
	}

}
