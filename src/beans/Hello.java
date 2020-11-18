package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Hello {

	@Autowired
	private Bike any;
	
	private String helloProperty = "default-hello";

	
	public Bike getBike() {
		return any;
	}


	public void setBikeAny(Bike anyName) {
		this.any = anyName;
	}

	public String getHelloProperty() {
		return helloProperty;
	}

	public void setHelloProperty(String helloProperty) {
		this.helloProperty = helloProperty;
	}

}
