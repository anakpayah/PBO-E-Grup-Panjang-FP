package id.ac.its.syafiq089;

public class Shape {

	protected String color;
	
	public Shape() {
		this.color = "Transparan";
		//System.out.println("[Shape]: Default Constructor");
	}
	
	public Shape(String color) {
		this.color = color;
		//System.out.println("[Shape]: Constructor color");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return 0.0;
	}
	
	public double getPerimeter() {
		return 0.0;
	}
	
	public void displayDetails() {
		System.out.println(getColor() + ", " + getArea());
	}
}
