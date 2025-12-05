package exo3;

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book("The cruel Prince", "Ava Black", 320);
		Book b2 = new Book("Game of Thrones", "George R. R. Martin", 789);
		
		b1.afficher();
		System.out.println("****************************************************");
		b2.afficher();
		

	}

}
