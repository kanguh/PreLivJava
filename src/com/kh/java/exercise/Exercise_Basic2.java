package com.kh.java.exercise;

import java.util.Scanner;
public class Exercise_Basic2 {
	//입력한 문자가 대문자인지 확인하는 프로그램읗 작성하여라
	//문자 하나 입력 : A
	//대문자인가? : true
	//문자 하나 입력 : k
	//대문자인가 ? : false
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char one = sc.next().charAt(0);
		boolean result = ('A' <= one ) && (one <= 'Z' );
		System.out.println("대문자인가? : " + result);
	}
}