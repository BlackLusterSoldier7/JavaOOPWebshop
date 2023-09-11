package sm2Webshop;

import java.util.ArrayList;
import java.util.List;

public class Seller extends User {
	
	
	
	
	//Ordered collection of elements. 
	private List<Product> products; 
	
	public Seller(String username, String password, String email, String firstName, String lastName) {
		
		
		super(username, password, email, firstName, lastName); 
		this.products = new ArrayList<>(); 
		
		
		
	}
	
	
	public void addProduct(Product product) {
		
		this.products.add(product); 
		
	}
	
	
	
	

}
