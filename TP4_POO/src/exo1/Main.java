package exo1;

public class Main {

	public static void main(String[] args) {
		Person p = new Person(1, "Hiba", "Djeraoui", 29);
		p.display();
		
		
		  //.out.println("person id: "+p.id);   //Compilation error : The field Person.id is not visible
//		// We can access through the getter
//		
		System.out.println("person id: "+p.getId()); 
		System.out.println("---------------------------------------------------------------------");

//		
		Employee e = new Employee(2 , "Mouna", "Djeraoui", 29, "Developer", 2500);
		e.display();
		
		System.out.println("---------------------------------------------------------------------");
	
		Teacher t = new Teacher(3, "Douaa", "Djeraoui", 20, "Teacher", 1500, "Languages");
		t.display();
		
		System.out.println("Teacher bonus: "+t.calculateBonus());
		
		AdjunctTeacher at = new AdjunctTeacher(5, "Douaa", "Djeraoui", 20, "Teacher", 1500, "Languages");
		System.out.println("Teacher bonus: "+at.calculateBonus());
	
		System.out.println("---------------------------------------------------------------------");

		
		AdminStaff a = new AdminStaff(4, "Zahia", "Djeraoui", 18, "Secretary", 1000, "Software");
		a.display();
	
		System.out.println("---------------------------------------------------------------------");

		Person p1 = t.getPerson();
		System.out.println("getPerson() returned: " + p1.getClass().getSimpleName());
		
	}

}
