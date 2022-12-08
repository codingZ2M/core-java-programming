package exceptions_handlingcom.codingz2m.custom.exceptions1;

//	When do we use Static Variable? 
//  If you don't want a variable to be an object specific, make it as static variable
//  All the objects share the same value.

public class Product {
	
	String productId;  // Non-Static Variable
	String productName;
	double price;
	static String category;  // Static Variable
	
	
	   // Static Block.. will be executed only once despite how many objects you created
	static {               
		category="Gadgets";
	}
	
	
	// Constructor is initializing only instance variable of an object
	public Product(String productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}


	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public static String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + this.productId + ", productName=" + this.productName + ", price=" + this.price + "]";
	}


}
