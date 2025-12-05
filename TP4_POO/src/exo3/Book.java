package exo3;

public class Book extends Media{
	
	private String author;
	private int nbPages;
	
	public Book(String title, String author, int nbPages) {
		super(title);
		this.author = author;
		this.nbPages = nbPages;
		// TODO Auto-generated constructor stub
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("Authored by: "+author);
		System.out.println("Number of pages: "+nbPages);
	}

	
}
