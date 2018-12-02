package ch.schaefer.norwin.webshop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductRepository {

	private List<Product> productList = new LinkedList<>();

	public ProductRepository() {
		productList.add(new Product("Xbox One X", "Tolle 4k Gaming Konsole", 500.00f));
		productList.add(new Product("WII", "Tolle Gaming Konsole mit viel Bewegungsspass", 100.00f));
		productList.add(new Product("PS4 Pro", "Tolle 4k Gaming Konsole", 400.00f));
	}

	public List<Product> getAllProducts() {
		return productList;
	}

	public List<Product> searchProducts(String param) {
		param = param.toLowerCase();
		List<Product> result = new ArrayList<>();
		for (Product product : this.productList) {
			if (product.getName().toLowerCase().contains(param)
					|| product.getDescription().toLowerCase().contains(param)) {
				// found one!
				result.add(product);
			}
		}
		return result;
	}

}
