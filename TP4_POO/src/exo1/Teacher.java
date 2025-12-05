package exo1;

public class Teacher extends Employee{

	protected String specialty;
	
	
	public Teacher(int id, String name, String surname, int age, String position, double salary, String specialty) {
		super(id, name, surname, age, position, salary);
		this.specialty = specialty;
	}
	
	
	@Override
	public void display() {
		super.display();
		System.out.println("Specialty: "+specialty);
	}

	@Override
	public Teacher getPerson() {
		return this;
	}
	
	@Override 
	public final double calculateBonus() {
		return salary * 0.15;
		//Cannot override the final method from Employee
	}
	
	
}
