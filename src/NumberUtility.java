import java.text.NumberFormat;
import java.util.Random;

public class NumberUtility {
	public String percentageFormat(double number){
		NumberFormat percent = NumberFormat.getPercentInstance();
		String majorityString = percent.format(number);
		return majorityString;
	}
	public String currencyFormat(double number){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceString = currency.format(number);
		return priceString;
	}
	public String setDecimal(double number, int decimal){
		NumberFormat no = NumberFormat.getNumberInstance();
		no.setMaximumFractionDigits(decimal);
		String decimalString = no.format(number);
		return decimalString;
	}
	public int randomBetween(int min, int max){
		if(min > max){
			int temp = min;
			min = max;
			max = temp;
		}			
		Random rnd = new Random();
		int randomInt = rnd.nextInt((max - min) + 1) + min;
		return randomInt;
	}
	public int maxNumber(int number1, int number2){
		return Math.max(number1, number2);
	}
	public int minNumber(int number1, int number2){
		return Math.min(number1, number2);
	}
}
