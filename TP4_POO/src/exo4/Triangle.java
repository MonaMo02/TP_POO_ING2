package exo4;

public class Triangle extends Form{
	
	private double base;
	private double height;
	

	public Triangle(String name, double height, double base) {
		super(name);
		this.height = height;
		this.base = base;
		// TODO Auto-generated constructor stub
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		return (base*height)/2;
	}
	
	@Override
	public void describe() {
		System.out.println("I am a Triangle");
	}

}
