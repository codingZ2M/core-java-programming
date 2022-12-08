package exceptions_handlingcom.codingz2m.custom.exceptions1;

public class ProductSearch {

	public static void main(String[] args) {
	
		ProductHandler productHandler = new ProductHandler();
		
		try {
			productHandler.findProduct("Portable Re-Writeable RuffPad 9 Inches");
		}
		catch(ProductNotFoundException pnfe) {
    		productHandler.processErrorCodes(pnfe);
			
		}
		
	}

}
