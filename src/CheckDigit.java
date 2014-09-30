import java.util.Objects;
import java.util.Scanner;

public class CheckDigit {

	public static boolean checkLength(Long CCNum){
		String CCNum1 = Objects.toString(CCNum, null);
		return CCNum1.length()>=13 &&  CCNum1.length()<=16;
	}
	
	public static boolean checkStart(Long CCNum){
		String CCNum1 = Objects.toString(CCNum, null);
		return CCNum1.startsWith("37") || CCNum1.startsWith("4") || CCNum1.startsWith("5") || CCNum1.startsWith("6");
	}

	public static boolean isValid(Long ccNumber) {
		String CCNum = Objects.toString(ccNumber, null);
		int sum = 0;
		boolean alt = false;
		for (int i = CCNum.length() - 1; i >= 0; i--) {
			int n = Integer.parseInt(CCNum.substring(i, i + 1));
			if (alt) {
				n *= 2;
				if (n > 9) {
					n = (n % 10) + 1; // sums the two digits
				}
			}
			sum += n;
			alt = !alt;
		}
		return (sum%10 == 0 && checkLength(ccNumber) && checkStart(ccNumber));
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card number: ");
		Long ccNum = input.nextLong();
		if(!checkStart(ccNum)){
			System.out.println("This credit card is not from a valid company");
		}
		else if(checkStart(ccNum) && !isValid(ccNum)){
			System.out.println("This does not pass the Luhn test");
		}
		else{
			System.out.println("This is a valid credit card");
		}
		

	}

}
