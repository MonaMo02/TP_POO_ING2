package exo4;

public class Circle extends Form{
	
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	@Override
	public void describe() {
		System.out.println("I am a Circle");
	}

}
