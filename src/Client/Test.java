package Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bike;
import beans.Hello;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Hello hello = ap.getBean("hello", Hello.class);
		System.out.println(hello.getHelloProperty());
		Bike bike = hello.getBike();
		System.out.println(bike.getBikeProperty());
		hello.setHelloProperty("changed-hello");
		Bike bb = new Bike();
		bb.setBikeProperty("changed-bike");
		hello.setBikeAny(bb);

		Hello h = ap.getBean("hello", Hello.class);
		System.out.println(h.getHelloProperty());
		Bike b = hello.getBike();
		System.out.println(b.getBikeProperty());
		ap.registerShutdownHook();

	}

}
