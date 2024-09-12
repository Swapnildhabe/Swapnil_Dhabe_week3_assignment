package assignment_3.question_1;

//assignment_3.question_1
//1) Create a base class Vehicle and derived classes Car Bike. Implement method overriding demonstrate polymorphism.


public class Vehicle {

	public void engine() {
		System.out.println("Vehicle have a Engine..");		
	}
	public void fule() {
		System.out.println("Vehicle get Energy from fule..");
	}
	public void wheels() {
		
	}
	public void headLight() {
		
	}
}
class Bike extends Vehicle{
		public void wheels() {
			System.out.println("Bike Have Two Wheels");
		}
		public void headLight() {
			System.out.println("Bike Have One Head Light");
		}
}
class Car extends Vehicle{
		public void wheels() {
			System.out.println("Car Have Four Wheels");
		}
		public void headLight() {
			System.out.println("Car Have Two Head Light");
		}
}
