import java.util.Calender;

public class Manager extends Employee {
	private Calender hireDate;

	public Manager(String name, int salary, Calender hireDate){
		super(name, salary);
		this.hireDate = hireDate;
	}

	public Calender getHireDate(){
		return this.hireDate;
	}

	public void setHireDate(Calender hireDate){
		this.hireDate = hireDate;
	}

	public boolean equals(Object other){
		try{
			Manager x = (Manager) other;
			if (super.equals(other) && this.hireDate.equals(x.getHireDate())){
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException c){
			return false;
		}
	}


	public String toString(){
        return(super.toString() + " hire date is:" + (this.hireDate.get(Calendar.YEAR)) + "/" + this.hireDate.get(Calendar.MONTH) + "/" + this.hireDate.get(Calendar.DATE));
    }

    public Manager clone(){
    	Manager x = (Manager) super.clone();
    	x.hireDate = (Calendar) this.hireDate.clone();
    	return x;
    }

    public vpoid emp(Employee e){
    	System.out.println(e.toString());
    }


}