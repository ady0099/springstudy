package ex06_web_DI;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloImpl implements Hello {
	
	public HelloImpl() {
		System.out.println("HelloImpp 생성자");
	}
	
	@Override
	public String sayHello() {
		return "Hello Spring World";
	}
	
}
