package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 28;
		int sum = 0;
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				sum+=i;
			}
		}
		
		if(number == sum) {
			System.out.println(number + " mükemmel sayıdır.");
		}else {
			System.out.println(number + " mükemmel sayı değildir.");
		}
		
	}

}
