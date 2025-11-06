// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int argument = Integer.parseInt(args[0]); // Gets a single integer input
	    int hundreds = argument / 100; // Calculate hundreds 
	    int tens = (argument % 100) / 10; // Calculate tens 
	    int ones = argument % 10; // Calculate ones 
        // Print the result in the required format
	    System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}
