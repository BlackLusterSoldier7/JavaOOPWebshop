package sm2Webshop;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<Product> orderedProducts;
	private int orderID;
	
	
	public Order(List<Product> products) {
		
		
	}
	

	public Order(int orderID, List<Product> products) {

		this.orderID = orderID;
		this.orderedProducts = new ArrayList<>(products);
	

	}

	public double getTotalPrice() {

		double total = 0;

		// for each loop. iterate over each element of a collection.
		// List iterating over each Product in the orderedProducts list.

		for (Product product : orderedProducts) {

			total += product.getPrice();

		}
		return total;
	}

	// Override toString() method from the superclass.

	@Override
	public String toString() {

		String result = "Order ID: " + orderID + "\n";
		result = result + "Products in this order:\n";

		
		//looping through Ordered Products 
		for (Product product : orderedProducts) {

			result = result + product.getName() + " - €" + product.getPrice() + "\n";

		}

		result = result + "Total price: €" + getTotalPrice();

		return result;

	}

}
