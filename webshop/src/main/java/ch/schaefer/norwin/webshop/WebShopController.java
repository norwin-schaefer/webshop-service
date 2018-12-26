package ch.schaefer.norwin.webshop;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class WebShopController {

	private ProductRepository productRepository;

	@Autowired
	public WebShopController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/greeting")
	public Greeting greeting(@RequestParam("message") String message) {
		Greeting greeting = new Greeting();
		greeting.setMessage(message);
		greeting.setDateTime(LocalDateTime.now());
		return greeting;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/products/all")
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/products/search")
	public List<Product> searchProducts(@RequestParam(name = "param") String param) {
		return productRepository.searchProducts(param);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/products/search2")
	public List<Product> searchProducts(float fromPrice, float toPrice) {
		return productRepository.searchProducts(fromPrice, toPrice);
	}

}
