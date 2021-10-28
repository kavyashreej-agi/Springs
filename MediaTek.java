package demo1.shree;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements Processor {
	public void process() {
		System.out.println("MediaTek processor");
	}

}
