package exo1;

public class Employee extends Person{
	

	protected String position;
	protected double salary;
	

	public Employee(int id, String name, String surname, int age, String position, double salary) {
	super(id, name, surname, age);
	this.position = position;
	this.salary = salary;
	}
	
	@Override
	public void display() {
        super.display(); // call Person display() first
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary + " DA");
    }
	
	public double calculateBonus() {
		return salary * 0.1; 
	}
	
}
