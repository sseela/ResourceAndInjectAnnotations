package beans;

import org.springframework.stereotype.Component;

@Component("111")
public class Bike {
	private String bikeProperty = "default-bike";

	public String getBikeProperty() {
		return bikeProperty;
	}

	public void setBikeProperty(String bikeProperty) {
		this.bikeProperty = bikeProperty;
	}
	
}
