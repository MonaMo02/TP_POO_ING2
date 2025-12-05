package exo4;

public class Form {
	
	private String name;
	
	public Form(String name) {
		this.name = name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public double calcArea() {
		System.out.println("area not defined");
		return 0;
	}
	
	public void display() {
		System.out.println("This is a generic form");
	}
	
	public void display(String message) {
		System.out.println("Form: "+name+" - "+message);
	}
	
	public void describe() {
		System.out.println("I am a generic form");
	}

}
