package stateandbehavior;

public class Account {
	protected double balance;
	protected double interestRate;
	
	public void deposit(double dep){
		if (dep < 0){
			throw new IllegalArgumentException();
		}
		balance+=dep;
	}
	
	public void addInterest(){
		balance+=interestRate*balance;
	}
	
	public Account(){
		balance = 0;
		interestRate = 1.01;
	}
	
	public Account(double balance,double rate){
		this.balance = balance;
		interestRate = rate;
	}
}
