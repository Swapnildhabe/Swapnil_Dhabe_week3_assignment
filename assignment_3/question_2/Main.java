package assignment_3.question_2;

//assignment_3.question_2
// 2) Implement a Shape class with derived classes Circle, Rectangle, and Triangle, each having method to calculate the area. 

public class Main {
	
	public static void main(String[] args) {
		
		Shape circle = new Circle(4);
		Shape rectangle = new Rectangle(12, 16);
		Shape trangle = new Trangle(9, 18);
		
		System.out.println("Area of Circle is : "+String.format("%.2f",circle.calculateArea()));
		System.out.println("Area of Rectangle is : "+rectangle.calculateArea());
		System.out.println("Area of Trangle is : "+trangle.calculateArea());
	}
}
