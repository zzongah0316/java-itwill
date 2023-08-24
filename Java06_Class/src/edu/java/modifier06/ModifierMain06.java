package edu.java.modifier06;

// final 수식어: 최종적인. 변경할 수 없는.
// final + 지역 변수 : 변경할 수 없는 지역 변수. 상수(constant). 초기화 이후에는 값을 변경할 수 없는 변수.
// final 클래스 멤버(필드, 생성자, 메서드) -> 보통 필드와 메서드를 final을 붙임. 변경 할 수 없음.
// final 필드(멤버 변수)는 반드시 초기화하는 문장을 명시해야 함.
//    (1) 필드 선언과 동시에 값을 초기화.
//    (2) (argument를 갖는) 생성자를 사용해서 값을 초기화.
// final + 클래스: 변경할 수 없는 클래스. 상속할 수 없는 클래스.

public class ModifierMain06 {
	
	private static final int VERSION = 1; // 선언과 동시에 초기화.
	
	// private final int test; 이 것만 있을 때는 초기화 안해서 오류 생김. -> 방법) 생성자 만들기.
	private final int test; // final 필드가 선언할 때 초기화하지 않는 경우에는 
	// 반드시 argument를 갖는 생성자를 이용해서 final 필드를 초기화해야 함.
	public ModifierMain06(int test) {
		this.test = test;
	}
	
	public static void main(String[] args) {
		// private int x = 1; -> private + 지역 변수: 불가능! 
		final int x = 1;
		// x = 2; -> final로 선언된 지역 변수는 재할당(값 변경)할 수 없다.
		
		// VERSION = 2; -> final 필드는 값을 재할당(변경)할 수 없음. 
	}

}
