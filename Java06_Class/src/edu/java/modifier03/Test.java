package edu.java.modifier03;

public class Test {
	// field
	private int number;
	private String name;
	private double pressure;
	private boolean married;
	
	
	
	// 마우스 오른쪽 클릭 -> Source -> Generate constructor using fields...
	public Test(int number, String name, double pressure, boolean married) {
		this.number = number;
		this.name = name;
		this.pressure = pressure;
		this.married = married;
	}

	public Test() {
	}

	public Test(int number, String name, double pressure) {
		this.number = number;
		this.name = name;
		this.pressure = pressure;
	}
	
	
	
    // 마우스 오른쪽 클릭 -> Source -> Generate getters and setters...
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
	
	
	
	
	
	
	
	

}
