package assignment_3.question_1;

//assignment_3.question_1
//1) Create a base class Vehicle and derived classes Car Bike. Implement method overriding demonstrate polymorphism.

public class Main {
	public static void main(String[] args) {
		Vehicle vl;
		System.out.println("Property Of Bike\n");
		
		vl=new Bike();
		vl.engine();
		vl.fule();
		vl.wheels();
		vl.headLight();
		
		System.out.println("__________________________________");
		
		System.out.println("Property Of Car\n");
		vl=new Car();
		vl.engine();
		vl.fule();
		vl.wheels();
		vl.headLight();
	}
}
