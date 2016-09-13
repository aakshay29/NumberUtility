
public class Main {

	public static void main(String[] args) {
		NumberUtility nu = new NumberUtility();
		System.out.println(nu.percentageFormat(5));
		System.out.println(nu.currencyFormat(52.25));
		System.out.println(nu.setDecimal(52.22365, 2));
		System.out.println(nu.randomBetween(9, -9));
		System.out.println(nu.minNumber(5, 2));
		System.out.println(nu.maxNumber(8, 16));
	}

}
