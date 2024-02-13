//constructor  and constructor overloading
public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee() {
		System.out.println("Default constructor is called");
		empId = 12;
		empName = "rohan";
		empSalary = 23434.34;
	}
	public Employee(int i, String s, double d) {
		empId = i;
		empName = s;
		empSalary = d;			
	}
	public String toString() {
		return "Employee = "+empId+" "+empName+" "+empSalary;
	}
	
	public static void main(String args[]) {
		Employee e = new Employee();
		System.out.println(e);
		Employee e1 = new Employee(15, "soham", 25000.34);
		System.out.println(e1);
	}
}
