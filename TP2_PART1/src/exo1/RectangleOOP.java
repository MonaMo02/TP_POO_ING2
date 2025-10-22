package exo1;

public class RectangleOOP {
	
	public static  double length; 
	public static double width;
	final static int NUMBER_OF_SIDES = 4;
	
	
	public static void calculateArea() {
		double area =  length * width;
		System.out.println("Area: "+ area);
	}
	
	public static  void calculatePerimeter() {
		double perimeter =  NUMBER_OF_SIDES / 2 * (length + width);
		System.out.println("Perimeter: "+ perimeter);
	}
	

	public static void main(String[] args) {
				
		length = 10;
		width = 5;
		
		System.out.println("Length: "+ length);
		System.out.println("Width: "+ width);
		
		calculateArea();
		calculatePerimeter();
		
	}

}
