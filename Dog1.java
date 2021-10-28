package maven_demo.kavya;

import org.springframework.stereotype.Component;

@Component
public class Dog1 implements Animal1 {
	public void speaks() {
		System.out.println("barks");
	}
}