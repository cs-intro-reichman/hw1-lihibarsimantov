// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0]; // first diner name argument
	    String name2 = args[1]; // second diner name argument
	    String name3 = args[2]; // third diner name argument
		int requiredSum = Integer.parseInt(args[3]); // required sum amount argument
		double amountPerDiner = Math.ceil(requiredSum / 3.0); // amount each diner pays
		// Print the result in the required format
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + 
		                   ": pay " + amountPerDiner + " Shekels each.");
						   
	}
}
