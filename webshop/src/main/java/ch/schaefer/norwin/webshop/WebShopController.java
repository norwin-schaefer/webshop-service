package ch.schaefer.norwin.webshop;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebShopController {

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam("message") String message) {
		Greeting greeting = new Greeting();
		greeting.setMessage(message);
		greeting.setDateTime(LocalDateTime.now());
		return greeting;
	}
}
