package exo3;

public class Media {
	
	private final String title;
	private final int registrationNum;
	private static int num = 0;
	
	public Media(String title) {
		this.title = title;
		this.registrationNum = num;
		num ++;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getRegistrationNum() {
		return this.registrationNum;
	}
	
	public void afficher() {
		System.out.println("Medium registration number: "+registrationNum);
		System.out.println("Title: "+title);
	}
	
	public boolean smallest(Media doc) {
		return this.registrationNum < doc.registrationNum;
	}
	
	

}
