package session_04;

public class Demo {
	
	private int x, y, z;
	private final float pi = 3.14f;
	
	public enum Seasons{SUMMER, WINTER, AUTTUMN, SPRING, FALL}; 
	
//	public Demo() { //we can also declared at line 6
//		pi = 31.14f;
//	}
	
//	public Demo(int x , int y, int z) {//its an eg
//		//pi = 3.14f
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//	
	public static void main(String args[]) {
		
//		final Date bdate = new Date(14, 12, 2002);
//		
//		bDate = new Date(13,11, 2011);
		
		//System.out.println("the value of pi: "+pi);
		
		Seasons s = Seasons.SUMMER;//it is the way
		System.out.println(s);
		
		for(Seasons s1: Seasons.values()) {
			System.out.println(s1+""+s1.ordinal());
			
			
		};
	}
	
	
}
