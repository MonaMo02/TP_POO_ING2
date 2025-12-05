package exo1;

public class AdminStaff extends Employee{
	
	protected String department; 

	
	public AdminStaff(int id, String name, String surname, int age, String position, double salary, String department) {
		super(id, name, surname, age, position, salary);
		this.department = department;
	}
	
	@Override
	public void display() {
		System.out.println("Admin staff information: ");
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary + " DA");
        System.out.println("Department: "+department);
	}


}
