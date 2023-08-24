package edu.java.inner01;

public class Outer {
	// field
	private int x;
	private int y;
	private String s;
	
	// constructor
	public Outer(int x, int y, String s) {
		this.x = x;
		this.y = y;
		this.s = s;
		
	}

	
	// method
	@Override
	public String toString() {
		return String.format("Outer(x=%d, y=%d, s=%s)", this.x, this.s);
	}
	
	// static이 아닌 멤버 내부 클래스(인스턴스 내부 클래스)
	public class Inner{
		// field
		private int y;
		
		// constructor
		public Inner(int y) {
			this.y = y;
		}
		
		// method
		public void printInfo() {
			System.out.println("---Inner Class---");
			System.out.println("y = " + y); // -> this.y: 내부 클래스의 멤버 y를 사용! 
			System.out.println("outer x = " + x); // -> Outer.this.x:내부 클래스는 외부 클래스의 멤버들을 사용할 
			System.out.println("outer y =" + Outer.this.y);
			System.out.println("s = " + s);
		}
		
	}

}
