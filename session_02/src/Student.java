//this reference
public class Student {
	private int rollno;
	private String name;
	
	public Student() {
		this(30, "soham");//used to call parameterized constructor
		System.out.println("default running");
	}
	
	public Student(int rollno, String name) {
//		this(); its used to call the default constructor
		System.out.println("parameter callled");
		this.rollno = rollno;//this refers to the instance var address
		this.name = name;
	}

	
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	public static void main(String args[]) {
		Student s = new Student(2, "rohan");
//		Student s  = new Student();
		System.out.println(s);
		
	}
	
	
}
