package util;

public class CurrencyCalculator {
	
	public static final double IOF = 1.06;
	
	public static final double convert(double amount, double currency) {
		return amount * currency * IOF;
	}
	
}
