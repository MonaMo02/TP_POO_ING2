package exo4;

public class Rectangle extends Form{
	
	private double length;
	private double width;

	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	@Override
	public double calcArea() {
		return length * width;
	}
	
	@Override
	public void describe() {
		System.out.println("I am a Rectangle");
	}

}
