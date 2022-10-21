package staticDemo;

public class ProductValidator {
	
	// Bir method statik yapıldığı zaman class ismi ile çağrılabilir.
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		
	}

}
