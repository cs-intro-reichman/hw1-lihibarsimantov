// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]); //  limit input
		int a = (int)(Math.random() * lim); // first random number
		int b = (int)(Math.random() * lim); // second random number
		int c = (int)(Math.random() * lim);// third random number
		System.out.println(a + " " + b + " " + c); // print a, b, c 
		int min = Math.min(a,b); // find minimum between a and b
		min = Math.min(min,c); // find minimum between min and c 
		int max = Math.max(a,b); // find maximum between a and b
		max = Math.max(max,c); // find maximum between a and b
		int middle = (a + b + c) - (min + max); // find middle number
		// Print the result in the required format
		System.out.println(min + " " + middle + " " + max); 

	}
}
