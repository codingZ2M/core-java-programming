package exceptions_handlingcom.codingz2m.custom.exceptions1;

public class ProductNotFoundException extends Exception {

	private String errorCode = "Unknown_Exception";

	public ProductNotFoundException(String message, String errorCode) {
		super(message);
		this.errorCode=errorCode;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
}