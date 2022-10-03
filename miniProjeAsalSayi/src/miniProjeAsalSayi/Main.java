package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 3;
		int temp = 0;
//		int remainder = number % 2;
//		
//		System.out.println(remainder);
		
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				temp++;
			}
		}
		
		if (temp > 1) {
			System.out.println(number + " sayısı asal değildir.");
		}else if (number == 1){
			System.out.println(number + " sayısı asal değildir.");
		}else {
			System.out.println(number + " sayısı asaldır.");
		}
		
		 

	}

}
