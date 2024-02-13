package assingment;

public class Employee {
	private int empNo =  00;
	private float empSal;
	private static float totalSal = 0;
	private static int totalEmp = 0;
	private static int itsEmpno = 0;
	
	public Employee() {}
	
	public Employee( float empSal) {
		empNo++;
		this.empSal = empSal;
		totalEmp++;
		Employee.itsEmpno += empNo;		
		Employee.totalSal += empSal;
	}
	
	public static int getTotalEmp() {
		return totalEmp;
	}
	public static float getTotalSal() {
		return totalSal;
	}
	
	
	public String toString(){
		return "Employee = [empNo="+itsEmpno+", empSal="+empSal+"]";
	}
//	static {
//		System.out.println("this is static block");
//		count = 60;
//	}
	
	public static void main(String args[]) {
		System.out.println("its the main method");
		Employee e1 = new Employee(508338.33f);
		System.out.println(e1);
		System.out.println(e1.getTotalEmp());
		System.out.println(e1.getTotalSal());
		Employee e2 = new Employee(55335.35f);
		System.out.println(e2);
		Employee e3 = new Employee(644342.66f);
		System.out.println(e3);
		

		System.out.println(e2.getTotalEmp());
		System.out.println(e2.getTotalSal());

		System.out.println(e3.getTotalEmp());
		System.out.println(e3.getTotalSal());
	}
}
