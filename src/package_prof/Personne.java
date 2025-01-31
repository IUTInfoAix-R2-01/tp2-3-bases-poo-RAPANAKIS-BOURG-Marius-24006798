package package_prof;

public class Personne {
	
	private String nom;
	private String prenom;
	
	public Personne(String prenom, String nom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	
	public String toString() {
		if (this.nom == null){
			return "Personne [prenom=" + getPrenom() + "]";
		}
		else {
			return "Personne [nom=" + getNom() + ", prenom=" + getPrenom() + "]";
		}
	}
	
	
	
	

}
