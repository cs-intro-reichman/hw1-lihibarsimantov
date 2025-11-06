// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]); // current value input
		double rate = Double.parseDouble(args[1]); // rate input
		int n = Integer.parseInt(args[2]); // number of years input
		double futureValue = currentValue * Math.pow((1 + (rate/100)), n); // future value calculation
		// Print the result in the required format
		System.out.println("After " + n + " years, $" + (int) currentValue + " saved at " + rate + "% will yield $" + (int) futureValue ); 

	}
}