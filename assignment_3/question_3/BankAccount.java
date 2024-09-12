package assignment_3.question_3;

//assignment_3.question_3
//3) Develop a simple program to demonstrate the concept of abstract classes and interfaces.  

abstract class BankAccount {
	String Name;
	String accountNumber;
	double balance;
	
	public BankAccount(String name, String accountNumber, double balance) {
		this.Name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	abstract void displyAccountinfo();
	
	abstract void initialBalance();
}
