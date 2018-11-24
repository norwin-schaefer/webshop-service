package ch.schaefer.norwin.webshop;

import java.time.LocalDateTime;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class WebShopController {

	@RequestMapping(method = RequestMethod.GET, path = "/greeting")
	public Greeting greeting(@RequestParam("message") String message) {
		Greeting greeting = new Greeting();
		greeting.setMessage(message);
		greeting.setDateTime(LocalDateTime.now());
		return greeting;
	}
}
