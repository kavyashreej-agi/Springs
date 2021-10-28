package demo1.shree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component

public class Samsung {
	@Autowired
	@Qualifier("mediaTek")
	Processor processor;
	
	public Processor getProcessor() {
		return processor;
	}
	
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
public void config() {
	System.out.println("configuration of samsung");
	processor.process();
}
}

	
	