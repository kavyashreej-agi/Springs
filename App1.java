package maven_demo.kavya;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App1 
{
    public static void main( String[] args )
    {
    	 
    	ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
//       Animal ani=(Animal) context.getBean("dog");
//       
//        ani.speaks();
    	
    	
//    	Food food=(Food) context.getBean("food");
//    	System.out.println(food.brand);
    	
    	Cat1 cat=(Cat1) context.getBean("cat");
//    	System.out.println(cat.getFood());
    	
    	
    	cat.wears();
    }
}