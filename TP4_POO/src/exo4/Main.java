package exo4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Form> shapes = new ArrayList<>();
		
		Circle c = new Circle("circle", 4);
		Rectangle r = new Rectangle("rectangle", 5, 6);
		Triangle t = new Triangle("triangle", 4, 7);
		
		shapes.add(c);
		shapes.add(r);
		shapes.add(t);
		
		for(Form shape : shapes) {
			System.out.println("Area of shape: "+shape.getName()+" is: "+shape.calcArea());
		}
		
		Form f = new Form("shape");
		f.display();
		f.display("overload test");
		
		Form f1 = new Circle("circle2", 3.5);
		System.out.println("Area: "+f1.calcArea());
		
		shapes.add(f);
		shapes.add(f1);
		
		for(Form shape : shapes) {
			shape.describe();
		}
		
	}

}
