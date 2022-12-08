package exceptions_handlingcom.codingz2m.builtin.exceptions;

import java.io.FileNotFoundException;

public class File {

	public static void main(String[] args) {
		
		try {
			FileHandler.handleFile(-5);
			FileHandler.handleFile(-10);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Write code in the finally block to close db connections to avoid any resource leaks!");
		}
		
		
		try {
			FileHandler.handleFile(15);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} 
		finally {
			System.out.println("Write code in the finally block to close db connections to avoid any resource leaks!");
		}
	
		
	}
}