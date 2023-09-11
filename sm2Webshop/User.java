package sm2Webshop;

import java.util.*;

public class User {

	private String username;
	private String password;

	private String email;
	private String firstName;
	private String lastName;

	private String[] searchHistory = new String[10];
	private String[] shoppingCart = new String[10];

	private List<String> searchHistoryList = new ArrayList<>();

	private List<Order> orders = new ArrayList<>();

	private ShoppingCart shoppingCartA;

	public User() {

		this.shoppingCartA = new ShoppingCart();

	}

	public ShoppingCart getShoppingCartA() {

		if (shoppingCartA == null) {

			shoppingCartA = new ShoppingCart();

		}

		return shoppingCartA;

	}

	public void addOrder(Order order) {
		// add order to orders list. Element to the end of a list.
		orders.add(order);

	}

	public void viewOrders() {

		if (orders.isEmpty()) {

			System.out.println("There are no orders");

		} else {

			System.out.println("You have the next orders: ");
			for (Order order : orders) {

				System.out.println(order);

			}

		}

	}

	public void addSearch(String searchQuery) {

		searchHistoryList.add(searchQuery);

	}

	public User(String username, String password, String email, String firstName, String lastName) {

		this.username = username;
		this.password = password;

		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public void viewProfile() {

		System.out.println("Username: " + username);
		System.out.println("Email: " + email);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);

	}

	public void viewSearchHistory() {

		System.out.println("Search History");
		for (String query : searchHistory) {

			System.out.println("- " + query);

		}

	}

	public void viewShoppingCart() {
		System.out.println("Shopping cart: ");
		for (String item : shoppingCart) {

			if (item != null) {
				System.out.println(item);

			}

		}
	}

	public String getUsername() {

		return username;

	}

	public void setUsername(String username) {

		this.username = username;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	public void login(String username, String password) {

	}

	public void logout() {

	}

}
