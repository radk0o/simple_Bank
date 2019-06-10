
public class MortgageAccount {
	private static int IBAN;
	private String owner;
	private float balance;
	private float montlyInterestRate;
	
	public MortgageAccount(int IBAN,String owner,float balance,float montlyInterestRate ) {
		this.IBAN=IBAN;
		this.owner=owner;
		this.balance=balance;
		this.montlyInterestRate=montlyInterestRate;
	}
	public void increaseFunds(float amount,String owner) {
		if(owner.equals(owner)) {
			this.balance=this.balance+amount;
		}
	}
	public void IndividualCustomer(int time,float montlyInterestRate ) {
		if(time>6) {
			this.balance=this.balance*montlyInterestRate;
		}else {
			this.balance=this.balance;
		}
	}
	public void CompanyCustomer(int time,float montlyInterestRate) {
		if(time>12) {
			this.balance=this.balance*montlyInterestRate;
}else {
	this.balance=(this.balance*montlyInterestRate)/2;
}
	}
}
