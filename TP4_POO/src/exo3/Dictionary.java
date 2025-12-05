package exo3;

public class Dictionary extends Media{
	
	private String language;
	private int nbVolume;

	public Dictionary(String title, String language, int nbVolume) {
		super(title);
		this.language = language;
		this.nbVolume = nbVolume;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNbVolume() {
		return nbVolume;
	}

	public void setNbVolume(int nbVolume) {
		this.nbVolume = nbVolume;
	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("Language: "+language);
		System.out.println("Volume: "+nbVolume);
	}

}
