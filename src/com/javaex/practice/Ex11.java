package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String alpha = sc.nextLine();
		
		switch(alpha) {
		case "a":
		case "e":
		case "u":
		case "o":
		case "i":
			System.out.println("모음입니다.");
			break;
			
		default :
			System.out.println("자음입니다.");
			break;
		}
		
		sc.close();
	}

}
