package id.ac.its.syafiq089;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
		
		//System.out.println("[Circle]: Default Constructor");
		this.radius = 0.0;
	}
	
	public Circle(double radius) {
		super();

		//System.out.println("[Circle]: Constructor2");
		this.radius = radius;
	}
	
	public Circle(String color, double radius) {
		super(color);
		
		//System.out.println("[Circle]: Constructor 3");
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
}
