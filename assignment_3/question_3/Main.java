package assignment_3.question_3;

//assignment_3.question_3
//3) Develop a simple program to demonstrate the concept of abstract classes and interfaces.  



public class Main {
	public static void main(String[] args) {
		
		Operation customer1 = new Operation("Swapnil Dhabe", "Abc2551", 500);
		Operation customer2 = new Operation("Ramesh", "Abc3552", 900);
		Operation customer3 = new Operation("Suresh", "Abc4553", 600);
		
		customer1.initialBalance();
		System.out.println();
		customer1.diposit(100);
		System.out.println();
		customer1.displyAccountinfo();
		System.out.println();
		customer1.withdraw(200);
		System.out.println();
		customer1.displyAccountinfo();
		System.out.println();
		customer1.initialBalance();
		
		System.out.println("_____________________________________________");
		
		customer2.initialBalance();
		System.out.println();
		customer2.diposit(300);
		System.out.println();
		customer2.displyAccountinfo();
		customer2.withdraw(1200);
		System.out.println();
		customer2.withdraw(600);
		System.out.println();
		customer2.displyAccountinfo();
		System.out.println();
		customer2.initialBalance();
	}
}
