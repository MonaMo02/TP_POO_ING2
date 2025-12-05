package exo3;

public class Library {

	public static void main(String[] args) {
		
		Media[] dataBase = new Media[10];
		
		dataBase[0]= new  Book("The cruel Prince", "Ava Black", 320);
		dataBase[1] = new Book("Game of Thrones", "George R. R. Martin", 789);
		dataBase[2] = new Dictionary("La Rousse", "French", 1);
		
		int i = 0;
		while(i<10 && dataBase[i]!=null) {
			dataBase[i].afficher();
			System.out.println("*************************************");
			i++;
		}
	}

}
