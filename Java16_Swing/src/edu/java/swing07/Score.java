package edu.java.swing07;

// MVC 아키텍쳐에서 Model 객체
public class Score {
	private int korean;
	private int english;
	private int math;
	
	public Score() {}

	public Score(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	
	
	// TODO: 세 과목의 총점을 int 타입으로 리턴하는 메서드. getTotal
	public int getTotal() {
		return this.korean + this.english + this.math ;
	}
	
	// TODO: 세 과목의 평균을 double 타입으로 리턴하는 메서드. getMean
	public double getMean() {
		return (double) (this.korean + this.english + this.math)/3 ;
	}
	
	// TODO: toString override
	@Override
	public String toString() {
		return String.format("Score(korean=%d, english=%d, math=%d)", 
				korean, english, math);
	}
	

}
