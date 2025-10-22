package exo2;

public class Learner {
	
	public String name;
	public String firstName;
	public String email;
	
	public Learner() {
		name = "unknown";
		firstName = "unknown";
		email = "not.defined@mail.com";
	}
	
	public Learner(String n, String fn, String e) {
		name = n;
		firstName = fn;
		email = e;
	}
	
	public void displayInfo() {
		System.out.println("Learner Info: ");
		System.out.println("Name: "+ name+" ,First name: "+ firstName+ " ,Email: "+email);
	}

}
