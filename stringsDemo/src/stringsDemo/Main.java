package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "       Bugün hava çok güzel.     ";

		System.out.println(mesaj);
//
//		System.out.println("Eleman Sayısı : " + mesaj.length()); // Boyutu
//
//		System.out.println("5. Eleman : " + mesaj.charAt(4)); // Seçilen karakteri
//
//		System.out.println(mesaj.concat(" Yaşasın!")); // Başka bir dizi ile birleştirme
//		
//		System.out.println(mesaj.startsWith("B")); // Dizi belirlenen eleman ile başlıyor mu
//		
//		System.out.println(mesaj.endsWith(".")); // Dizi belirlenen eleman ile bitiyor mu
//		
//		char[] karakterler = new char[5];
//		
//		mesaj.getChars(0, 5, karakterler, 0); // Belirli dizinin elemanlarını başka diziye aktarır
//		
//		System.out.println(karakterler);
//		
//		System.out.println(mesaj.indexOf("a")); // Seçilen değerin dizide yer alan sırasını verir (İlk bulduğunu verir)
//		
//		System.out.println(mesaj.lastIndexOf("a")); //Seçilen değerin dizide yer alan sırasını verir (Son bulduğunu verir)
		
		String yeniMesaj = mesaj.replace(' ', '-'); // Değerleri değiştirme işlemi yapar
		
		System.out.println(yeniMesaj); 
		
		System.out.println(mesaj.substring(5,10)); // Metnin içerisinden bir parçayı çıkarır
		
		for (String kelime : mesaj.split(" ")) { // Belirlenen karaktere göre diziyi böler
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); // Karakter dizisinin değerlerini küçük harf ile yazar
		
		System.out.println(mesaj.toUpperCase()); // Karakter dizisinin değerlerini büyük harf ile yazar
		
		System.out.println(mesaj.trim()); // Gelen karakter dizisinin başındaki ve sonundaki boşlukları kaldırır

	}

}
