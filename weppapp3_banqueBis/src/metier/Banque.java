package metier;

import java.util.ArrayList;

public class Banque {
	ArrayList<Client> clients = new ArrayList<Client>();

	public void creerClient(String nom, String adresse) {
		this.clients.add(new Client(nom, adresse));
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

}
