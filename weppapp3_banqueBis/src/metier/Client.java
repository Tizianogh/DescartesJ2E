package metier;

import java.util.ArrayList;
import java.util.UUID;


public class Client {
	private UUID id;
	private String nom;
	private String adresse;
	
	public Client(String nom, String adresse) {
		this.id = UUID.randomUUID();
		this.nom=nom;
		this.adresse=adresse;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
