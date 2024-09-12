package assignment_3.question_2;

//assignment_3.question_2
//2) Implement a Shape class with derived classes Circle, Rectangle, and Triangle, each having method to calculate the area. 

abstract class Shape {
	public abstract double calculateArea();

}

class Circle extends Shape {
	private double radius;
	
	public Circle(double radius){
		this.radius= radius;
	}

	@Override
	public double calculateArea() {
		
		return Math.PI*radius*radius;
	}
}

class Rectangle extends Shape{
	private double length1;
	private double length2;
	
	public Rectangle(double length1, double length2) {
		this.length1 = length1;
		this.length2 = length2;
	}
	
	public double calculateArea() {
		
		
		return length1 * length2;
	}
}

class Trangle extends Shape{
	private double length;
	private double height;
	
	public Trangle(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		
		return ((length*height)/2);
	}
	
}





