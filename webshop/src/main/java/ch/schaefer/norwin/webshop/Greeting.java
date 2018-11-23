package ch.schaefer.norwin.webshop;

import java.time.LocalDateTime;

public class Greeting {

	private String message;
	private LocalDateTime dateTime;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
		
}
