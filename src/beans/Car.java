package beans;

import org.springframework.stereotype.Component;

@Component("car")
public class Car {

		private String carProperty = "default-car";

		public String getCarProperty() {
			return carProperty;
		}

		public void setCarProperty(String carProperty) {
			this.carProperty = carProperty;
		}
		
		
}
