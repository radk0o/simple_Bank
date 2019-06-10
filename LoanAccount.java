
public class LoanAccount {
	private static int IBAN;
	private String owner;
	private float balance;
	private float montlyInterestRate;
	int time;
	
	public LoanAccount(int IBAN,String owner,float balance,float montlyInterestRate,int time ) {
		this.IBAN=IBAN;
		this.owner=owner;
		this.balance=balance;
		this.montlyInterestRate=montlyInterestRate;
		this.time=time;
	}
	public void increaseFunds(float amount,String owner) {
		if(owner.equals(owner)) {
			this.balance=this.balance+amount;
		}
	}
	public void IndividualCustomer(int time,float montlyInterestRate ) {
		if(time>2) {
			this.balance=this.balance*montlyInterestRate;
		}else {
			this.balance=this.balance;
		}
	}
	public void CompanyCustomer(int time,float montlyInterestRate) {
		if(time>3) {
			this.balance=this.balance*montlyInterestRate;
		}else {
			this.balance=this.balance;
		}
	}
	
	
}
	
