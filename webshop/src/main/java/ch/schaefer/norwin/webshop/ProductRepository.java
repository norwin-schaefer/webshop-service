package ch.schaefer.norwin.webshop;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ProductRepository {

	private ArrayList<Product> productList = new ArrayList<>();

	public ProductRepository() {
		productList.add(new Product("Xbox One X", "Tolle 4k Gaming Konsole", 500.00f));
		productList.add(new Product("WII", "Tolle Gaming Konsole mit viel Bewegungsspass", 100.00f));
		productList.add(new Product("PS4 Pro", "Tolle 4k Gaming Konsole", 400.00f));
	}

	public ArrayList<Product> getAllProducts() {
		return productList;
	}

}
