package maven_demo.kavya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat1 implements Animal1 {
	
	@Autowired
	private Food food;
	
	@Autowired
	private Accessories accessories;
		
	public Accessories getAccessories() {
		return accessories;
	}
	public void setAccessories(Accessories accessories) {
		this.accessories = accessories;
	}
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public void speaks(){
		System.out.println("meows");
	}
public void eat() {
	System.out.println("cat eats "+food);
}

public void wears() 
{
	System.out.println("cat wears "+accessories);
	System.out.println("it is of color "+accessories.color);
}
}
