package edu.java.conditional03;

import java.util.Scanner;

public class ConditionalMain03 {

	public static void main(String[] args) {
		// 간단한 성적 처리 프로그램
		//Scanner를 사용해서 세 과목(java, sql, html)의 점수를 입력받고 변수에 저장.
		// 세 과목의 총점을 계산하고 출력.
		// 세 과목의 평균을 계산하고 출력.
		// 학점(A, B, C, D, F)를 출력.
		
		// Ctrl+space: 코드 추천  -> 맥일때는 단축키 변경
		// Ctrl+F11: 실행 (Run java program)
		
		Scanner sc = new Scanner(System.in); // 입력장치 Scanner를 사용할 준비 끝남. -> 위에 import 만들어졌는지 확인하기.
		
		System.out.println("자바 점수 입력 >>> ");
		int java = sc. nextInt();
		System.out.println("Java 점수 : " + java);
		
		System.out.println("sql 점수 입력>>> ");
		int sql = sc. nextInt();
		System.out.println("sql 점수 : " + sql);
		
		System.out.println("html 점수 입력 >>> ");
		int html = sc. nextInt();
		System.out.println("html 점수 : " + html);
		
		int total = java + sql + html; // 세 과목 총점 계산
				System.out.println("총점 : " + total);
		double average = total / 3.0 ; // 세 과목 평균 계산 [다른 방법]-> double average = (double) total / 3 ; casting(강제 타입 변환) 방법
		        System.out.println("평균 : "+ average );
		
		        
		// 학점 출력
		if (average >= 90) { System.out.println("학점: A"); }
		else if (average >= 80) { System.out.println("학점: B"); }
		else if (average >= 70) { System.out.println("학점: C"); }
		else if (average >= 60) { System.out.println("힉잠: D"); }
		else { System.out.println("학점: F"); }
		}

		

	}

