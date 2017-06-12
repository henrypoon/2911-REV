public class Employee implements Cloneable{

	private String name;
	private int salary;

	/**
	* @param name
	* @param salary
	**/

	public Employee (String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	/**
	*
	*@return name
	*/
	public String getName(){
		return this.name;
	}

	/**
	*
	*@return salary
	*/
	public int getSalary(){
		return this.salary;
	}

	/**
	*@param name
	*
	*/
	public void setName(String name){
		this.name = name;
	}

	/**
	*@param salary
	*
	*/
	public void setSalary(int salary){
		this.salary = salary;
	}

	public Employee clone(){
		try {
			Employee employee = new Employee(this.name, this.salary);
			return employee;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean equals(Object e){
		if (e == null) return false;
		if (this == e) return true;
		if (this.getClass() != e.getClass()) return false;
		Employee that = (Employee) e;
		if (this.getName().equals(that.getName()) && this.getSalary() == that.getSalary()){
			return true;
		} else {
			return false;
		}
	}

	public String toString(){
		return (this.name + " " + this.salary);
	}

}