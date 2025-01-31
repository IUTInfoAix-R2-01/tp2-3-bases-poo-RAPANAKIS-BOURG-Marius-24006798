package ex5;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public int raiseSalary(int percent) {
		double percentD = (double)percent/100; 
		double salaryTmp = this.salary;
		
		salaryTmp = salaryTmp + percentD*salaryTmp;
		
		this.salary = (int)salaryTmp;
		return this.salary;
	}
	
	public String toString() {
		return "Employee[id="+id+",name="+getName()+",salary="+salary+"]";
	}
}
