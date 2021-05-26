package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		int tall = sc.nextInt();
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		double pyo = (tall-100)*0.9;
		
		if((weight/pyo)*100<=80) {
			System.out.println("극심한 저체중 입니다.");
			System.out.println("표준체중: "+pyo);
		}
		else if ((weight/pyo)*100>80 && (weight/pyo)*100<=90) {
			System.out.println("저체중 입니다.");
			System.out.println("표준체중: "+pyo);
		}
		else if ((weight/pyo)*100>91 && (weight/pyo)*100<=110) {
			System.out.println("표준 입니다.");
			System.out.println("표준체중: "+pyo);
		}
		else if ((weight/pyo)*100>111 && (weight/pyo)*100<=120){
			System.out.println("과체중 입니다.");
			System.out.println("표준체중: "+pyo);		
		}
		else {
			System.out.println("비만 입니다.");
			System.out.println("표준체중: "+pyo);		
		}
		
		sc.close();
	}

}
