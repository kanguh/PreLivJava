package com.kh.java.exercise;

import java.util.Scanner;

public class Exercise_Basic1 {
	/* 
	 *입력한 정수가 1~100사이의 숫자인지 확인하는 프로그램
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		boolean result = (num>=1)&&(num<=100);
		System.out.println("1~100 사이의 숫자인가? : " + result);
	}
}
