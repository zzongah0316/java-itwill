package edu.java.inner01;

public class Enclosing {
	public static int var = 123;
	private int x;
	
	public Enclosing(int x) {
		this.x = x;
	}
	
	// Enclosing.test() 호출하려는 메서드.
	public static void test() {
		System.out.println(var);
		// System.out.println(x);
		// -> static 멤버는 다른 static 멤버들만 사용 가능. non-static 멤버들은 사용 불가!
	}

	@Override
	public String toString() {
		// 인스턴스(static이 아닌) 메서드는 static 또는 non-static 멤버를 모두 사용할 수 있음.
		return String.format("Enclosing(x=%d, static var=%d)", x, var);
	}
	
	// static 내부 클래스 - 외부 클래스의 객체 생성 여부와 상관 없이 생성자를 호출할 수 있음! -> import 문 없을 때
	public static class Nested { // -> import 문 있을 때
		private int x;
		
		public Nested(int x) {
			this.x = x;
		}
		public void printInfo () {
			System.out.println("---static inner class---");
			System.out.println("x = " + x); // -> 내부 클래스 멤버 사용.
			// System.out.println(Enclosing.this.x);
			// -> static 내부 클래스에서는 외부 클래스의 non-static을 사용할 수 없음!
			System.out.println("Enclosing var = " + var);
		}
	}

}
