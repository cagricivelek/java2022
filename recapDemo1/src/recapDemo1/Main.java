package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 100;
		int sayi2 = 1021;
		int sayi3 = 200;
		
		int temp;
		
		if (sayi1 > sayi2 && sayi1 > sayi3) {
			temp = sayi1;
		} else if(sayi2 > sayi1 && sayi2 > sayi3){
			temp = sayi2;
		}else {
			temp = sayi3;
		}
		
		System.out.println("En büyük sayı : " + temp);

	}

}
