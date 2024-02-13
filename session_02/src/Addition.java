
public class Addition {
	//method overloading
	public int add(int a, int b) {
		return a+b;
	}
	public float add(float a, float b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public int add(int... a)//elipses 
	{
		int sum = 0;
		//for each loop
		for(int i:a) {//a is an array
			sum+=i;
		}
		return sum;
	}
	
	
	public static void main(String args[]) {
		Addition a = new Addition();
		System.out.println("with 2 parameter of int:"+a.add(1,2));
		System.out.println("with 2 parameter of float:"+a.add(1.5f,2.6f));
		System.out.println("with 3 parameter of int:"+a.add(1,2, 3));
		System.out.println("var args:"+a.add(1,2,3,4,5,6,7));
	}
	
}
