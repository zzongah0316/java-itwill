package edu.java.variable01; // 패키지 선언문(저장 위치)

// 클래스 선언
public class VariableMain01 {

	// 메인 메서드 선언
	public static void main(String[] args) {
		
		
		// 변수(variable): 프로그램에서 필요한 데이터를 저장하는 메모리 공간.
		
        // (1) 변수 선언 -> (2) 변수 초기화(값을 처음 저장)
		int x; // (1) 변수_타입 변수_이름;
	    x = 100; // (2) 변수_이름 = 값;
		System.out.println(x); // 변수 x의 값을 출력.
		
		int y = 200; // 변수 선언과 초기화를 한 문장으로 작성.
		System.out.println(y);
		
		x = 300; // 이미 선언된 변수 x의 값을 300으로 바꿈.
		System.out.println(x);
		
		//int y = 50; //같은 이름 y로 변수를 선언햇기 때문에 문법 오류.
		
		
		// 변수 이름을 만드는 문법 , 관습: 
		// 1. 변수 이름은 알파벳 , 숫자, _(underscore)를 사용
		// 2. 변수 이름은 숫자로 시작하면 안됨.
		// 3. 자바의 키워드(int, if, for, ...)는 변수 이름으로 사용할 수 없음.
		// 4. 같은 이름으로 변수를 두번 선언할 수 없음.
		// 5. 변수 이름은 영문 소문자로 시작하는 것을 권장.
		// 6. 변수 이름을 2개 이상의 단어로 만들 때는 camel 표기법을 사용하는 것을 권장.
		//  (예) studentName, studentAge,...
		
		
	}

}
