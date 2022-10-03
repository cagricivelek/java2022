package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","Asus Laptop", 5000, 5, "Siyah");
	
		
//		System.out.println(product.getName());
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product);
		
		
	}

}
