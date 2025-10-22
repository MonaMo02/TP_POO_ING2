package exo2;

public class Instructor {

	public String name;
	public String specialty;
	
	public Instructor(String n, String sp) {
		name = n;
		specialty = sp;
	}
	
	public void displayInfo() {
		System.out.println("Instructor Info: ");
		System.out.println("Name: "+ name+" ,Specialty: "+specialty);
	}
	
	
}
