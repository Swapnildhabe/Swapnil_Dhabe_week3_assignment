package assignment_3.question_3;

//assignment_3.question_3
//3) Develop a simple program to demonstrate the concept of abstract classes and interfaces.  

public class Operation extends BankAccount implements Account {
	double initialBalance;
	
	public Operation(String name, String accountNumber, double balance) {
		super(name, accountNumber, balance);
		this.initialBalance = balance;
	}

	@Override
	public void diposit(double amount) {
		balance += amount;
		System.out.println("Dear "+Name+"\n in your Account Number :"+accountNumber+"\n Amount"+amount+"is Deposited");
	
	}

	@Override
	public void withdraw(double amount) {
		if(amount < balance) {
			balance -= amount;
			System.out.println(" Dear "+Name+"\n in your Account Number :"+accountNumber+"\n Amount"+amount+" is Withdraw");
		}else {
			System.err.println("Dear "+Name+" Insufficient funds in SavingsAccount "+accountNumber);
		}
		
	}

	@Override
	void displyAccountinfo() {
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Holder Name :"+Name);
		System.out.println("Account Balance :"+balance);
		
	}

	@Override
	void initialBalance() {
		System.out.println(Name+" Your Initial Balance is "+ initialBalance);
		
	}

}
