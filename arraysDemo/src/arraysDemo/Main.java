package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[4];
		
		ogrenciler[0] = "Çağrı";
		ogrenciler[1] = "Alper";
		ogrenciler[2] = "Kadir";
		ogrenciler[3] = "Esra";
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
