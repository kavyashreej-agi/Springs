package Project.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	GreeterService gs = context.getBean(GreeterService.class);
    	gs.printGreeting();
    }
}
