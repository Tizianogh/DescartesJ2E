package modele;

public class Client{
	
	private int numero;
	private String nom;
	private String adresse;
	
	private static int CompteurNumero = 1;
	
	public Client(String nom, String adresse) {
		this.numero = CompteurNumero++;
		this.nom = nom;
		this.adresse = adresse;
	}	
	
	public int getNumero() {
		return numero;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getAdresse() {
		return adresse;
	}
}
