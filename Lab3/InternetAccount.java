import java.util.Calendar;


public Class InternetAccount extends BankAccount{
	public static final int internet_payment_limit = 10;
	private int internet_payment;

	public InternetAccount(String ID) {
		super (ID);
		this.internet_payment = 0;
	}

	public int getInternetPaymentAmount(){
		return this.internet_payment;
	}

	/**
	*@param amount
	*@pre amount > 0 && balance >= amount
	*
	*/
	public boolean withdraw(int amount) {
		Calendar c1 = Calendar.getInstance();
		boolean same_date = this.checkDate(c1);
		if(this.internet_payment >= 10) {
			return false;
		}
		if(!same_date){
			this.internet_payment = 0;
			this.setCal(c1);
		}
		boolean success = super.withdraw(amount);
		if(success){
			this.internet_payment++;
			return true;
		}
		return false;
	}

}