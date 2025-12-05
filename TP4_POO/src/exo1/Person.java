package exo1;

public class Person {
	
	private int id;
	protected String  name;
	protected String surname;
	protected int age;
	
	public Person(int id, String name, String surname, int age) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public void display() {
        System.out.println("Person Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Age: " + age);
    }

	public int getId() {
		return id;
	}

	public Person getPerson() {
		return this;
	}

}
