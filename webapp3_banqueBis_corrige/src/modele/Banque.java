package modele;

import java.util.ArrayList;
import java.util.List;

public class Banque {
	
	private List<Client> clients = new ArrayList<Client>();
	
	public Client creerClient(String nom, String adresse) throws ClientDejaExistantException {
		if (this.rechercherClient (nom, adresse)!=null)
			throw new ClientDejaExistantException();
		Client c = new Client (nom, adresse); 
		this.clients.add(c);
		return c;
	}

	public Client rechercherClient(String nom, String adresse) {
		for (Client c : this.clients) {
			if (c.getNom().equals(nom) && c.getAdresse().equals(adresse))
				return c;
		}
		return null;
	}
}
