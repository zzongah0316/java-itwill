package edu.java.method05;

public class MethodMain05 {

	public static void main(String[] args) {
		System.out.printf("이름: %s \n", "오쌤");
		System.out.printf("이름: %s, 나이: %d \n", "오쌤", 16);
		System.out.printf("이름: %s, 나이: %d, 키: %f \n ", "오쌤", 16, 180.5);
		
		// 가변 길이 (variable-length) argument를 갖는 메서드: 
		// 파라미터를 선언할 때, 변수 타입 뒤에 "..."을 붙임.
		// 가변 길이 아규먼트에는 전달하는 값의 개수는 제한이 없음. 아규먼트를 전달하지 않아도 됨!
		// ex) System.out.printf
		// 가변 길이 아규먼트는 메서드 안에서는 배열처럼 취급함.
		// (주의) 가변 길이 아규먼트는 가장 마지막 파라미터로 선언해야 함!
		// (주의) 가변 길이 아규먼트를 갖는 파라미터는 오직 1개만 선언할 수 있음.
	
		
		double result = calculate("+"); // 가변 길이 아규먼트를 0개 전달한 경우.
		System.out.println(result);
		
		result = calculate("+", 1, 2); // 가변 길이 아규먼트를 3개 전달한 경우.
		System.out.println(result);
		
	    result = calculate("*", 1, 2, 3, 4, 5);
	    System.out.println(result);
	    
	    double[] arr = {1.0, 1.1}; // 가변길이 아규먼트일 때는 배열을 전달해도 됨.
	    System.out.println(calculate("*", arr));
	    
	    System.out.println(calculate("*"));

	}
	
	/**
	 * argument op가 "+"인 경우에는, 모든 가변 아규먼트들의 합계를 반환하고,
	 * argument op가 "*"인 경우에는, 모든 가변 아규먼트들의 곱을 반환하는 메서드.
	 * @param op "+" 또는 "*". 그 이외의 문자열들은 모두 무시.
	 * @param args double 타입의 (임의의 개수의) 숫자(들).
	 * @return double. 
	 * op가 "+"이면 모든 숫자들의 합을 리턴.
	 * op가 "*"이면, 모든 숫자들의 곱을 리턴
	 * op가 "*"인데, 아규먼트로 전달된 숫자가 없으면 1을 리턴.
	 * op가 "+"또는 "*"가 아니면 0.0을 리턴.
	 */
	
	public static double calculate(String op, double... args) {
		double result = 0.0;
		
		switch (op) {
		case "+":
			for(double x : args) {
				result +=x;
			}
			break;
		case "*":
			result = 1.0;
			for(double x : args) {
				result *= x; // result = result * x;
			}
			break;
	    default:
		}
		
		return result;
	}

}
