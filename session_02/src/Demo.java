
public class Demo {
   //instance variable
	private int day, month, year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int d) {
		day = d;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int m) {
		month = m;
	}
		public static void main(String args[]) {
			Demo d = new Demo();
			d.setDay(7);
			d.setMonth(2);
			System.out.print("day is "+d.getDay());
			System.out.println(" and month is "+d.getMonth());
		}
	
}
