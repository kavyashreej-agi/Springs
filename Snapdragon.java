package demo1.shree;



import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Snapdragon implements Processor {

	public void process() {
		System.out.println("Snapdragon processor");

	}

}