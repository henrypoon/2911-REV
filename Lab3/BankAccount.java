import java.util.Calender;
public class BankAccount {
	public static final int withdraw_limit = 800;
	private int balance;
	private String ID;
	private Calander cal;
	private int withdraw_amount;

	public BankAccount(String ID){
		this.ID = ID;
		this.balance = 0;
		this.withdraw_amount = 0;
		this.cal = Calander.getInstance();
	}

	public int getBalance(){
		return this.balance;
	}

	public String getID(){
		return this.ID;
	}


	public String toString(){
    	return this.ID + this.balance + this.cal.get(Calendar.YEAR) + this.cal.get(Calendar.MONTH) + this.cal.get(Calendar.DATE) + "";
	}

	public void setCal(Calendar c){
		this.cal = c;
	}

	/**
	*@param amount
	*@pre amount > 0
	*@post balance = balance + amount && balance >= 0
	*
	*/
	public void deposite(int amount){
		this.balance += amount;
	}

	/**
	*@param amount
	*@pre amount > 0 
	*@post balance >= 0
	*/	
    public boolean withdraw(int amount) {
    	Calendar c1 = Calendar.getInstance();
    	boolean same_date = this.checkDate(c1);
    	
    	if(same_date && this.withdrawal_amount + amount <= this.withdrawal_limit) {
    		this.withdrawal_amount += amount;
    		balance -= amount;
    		return true;
    	} else if(!same_date) {
    		this.withdrawal_amount = amount;
    		this.cal = c1;
    		balance -= amount;
    		return true;
    	}
    	return false;
    }

	public boolean checkDate(Calendar c1){
    	if(c1.get(Calendar.YEAR) == this.cal.get(Calendar.YEAR) && c1.get(Calendar.MONTH) == this.cal.get(Calendar.MONTH) && c1.get(Calendar.DATE) == this.cal.get(Calendar.DATE)){
    		return true;
    	}
    	return false;
    }

}