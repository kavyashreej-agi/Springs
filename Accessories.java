package maven_demo.kavya;

import org.springframework.stereotype.Component;
@Component
public class Accessories 
{
	double price;
	String color;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Accessories [price=" + price + ", color=" + color + "]";
	}
}
