package com.kh.java.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		// 남자이명서 평균평점이 4.3이상인 사람 ?
		
		// 컴퓨터공학과 또는 경영학과인 사람 ?
		String gender = "남자";
		double score = 4.1;
		boolean result = (gender == "남자") && (score >= 4.3);
		result = (gender == "남자") || (score >= 4.3);
		//1보다 크고 100보다 작은 경우
		int input = 33;
		result = (1 < input) && (input < 100);
		score = 59;
		// 1과 100사이의 수인가
		// 1보다 크거나 같고 100보다 작거나 같은 경우
		result = (1 < score) && (score < 100);
		result = (1 <= score) && (score <= 100);
		
	}

}