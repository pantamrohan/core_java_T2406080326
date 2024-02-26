package session_05;
//multi dimension array /2d arr
public class Demo {
	public static void main(String args[]) {
		int arr[][] = new int[2][3];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = (i+j+1);
			}
		 }
		
		
		System.out.println("the arrays values are:");
		for(int[] i: arr) {//its only used for read only the opper
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		int sum = 0;
		
			for(int i = 0; i<arr.length; i++) {
				sum=0;
				for(int j = 0; j<arr[i].length; j++) {
					sum = sum+arr[i][j];
					
				}
				System.out.println("the sum of row "+(i+1)+" is:"+sum);
				
			}
		
		
		
		
	}
}
