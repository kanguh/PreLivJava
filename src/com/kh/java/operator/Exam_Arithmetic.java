package com.kh.java.operator;

public class Exam_Arithmetic {
	public static void main(String [] args) {
		System.out.println(1+1);
		System.out.println(1-1);
		System.out.println(1*1);
		System.out.println("divide : " +5/2); //몫
		System.out.println("mod : " +5%2); // 나머지
		/* 3의배수인지 아닌지 판별하시오
		 * 3, 6, 9, 12, 15, ...
		 * 3*3, 3*2, 3*3, 3*4, ...
		 * 3/3=1, 6/3=2, 9/3=3,...
		 * 3%3=0,6%3=0, 9%3=0,...
		 * 5의배수인지 아닌지 판별하시오
		 * 5%5=0, 10%5=0, 15%5=0, ...
		 * 
		 * 짝수인지 홀수인지 판별하시오 라고 하면
		 * %2 == 0 짝수, %2 !=0 홀수	 
		 */
		int num1 = 2;
		int num2 = 3;
		String result = (num1 > num2) ? "참" : "거짓";
		
		int num = 2;
		result = (num%2 == 0) ? "짝수" : "홀수";
		/* 삼항연산자는 제어문-조건문을 간단하게 쓸 수 있음
		 * 오히려 가독성을 해칠 수 있음
		 * 간결해지면서 가독성을 해치지 않는 경우에만 사용하는 것을 권장
		 */
	}
}
