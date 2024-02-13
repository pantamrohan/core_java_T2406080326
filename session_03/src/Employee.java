
public class Employee {
	private int empId;
	private String empName;
	private float empSal;
	private static int count;
	
	public Employee() {}
	
	public Employee(int empId, String empName, float empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	
	public String toString(){
		return "Employee = [empId="+empId+", empName="+empName+", empSal="+empSal+"]";
	}
//	static {
//		System.out.println("this is static block");
//		count = 60;
//	}
	
	public static void main(String args[]) {
		System.out.println("its the main method");
		Employee e1 = new Employee(111, "rohan", 508338.33f);
		System.out.println(e1);
		System.out.println(e1.getCount());
		Employee e2 = new Employee(222, "soham",55335.35f);
		System.out.println(e2);
		Employee e3 = new Employee(333, "sidhu", 644342.66f);
		System.out.println(e3);
		

		System.out.println(e2.getCount());
		System.out.println(e3.getCount());
		System.out.println(Employee.getCount());
	}
}
