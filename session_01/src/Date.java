
public class Date {
	private int dd, mm, yy; 
	
	public void inItDate() {
		dd=mm=yy;
	}
	public void setDate(int d, int m, int y) {
		dd= d;
		mm= m;
		yy= y;
	}
	public void displayDate() {
		System.out.println("date: ["+dd+"/"+mm+"/"+yy+"]");
		}
	public static void main(String args[]) {
		Date d = new Date();
		System.out.println(d.dd);
		d.inItDate();
		d.displayDate();
		d.setDate(7, 2, 2024);
		d.displayDate();
	}
}
