
public class DepositAccount {
	
	private static int IBAN;
	private String owners;
	private float balance;
	private float montlyInterestRate;
	

	public DepositAccount(int IBAN,String owner,float balance,float montlyInterestRate) {
		this.IBAN=IBAN;
		this.owners=owner;
		this.balance=balance;
		this.montlyInterestRate=montlyInterestRate;
	}
	public void deductFunds(float amount,String owner) {
		if(owner.equals(owner)) {
			this.balance=this.balance-amount;
		}
	}
	public void increaseFunds(float amount,String owner) {
		if(owner.equals(owner)) {
			this.balance=this.balance+amount;
		}
	}
	

	
}
	
		
	

	
	


