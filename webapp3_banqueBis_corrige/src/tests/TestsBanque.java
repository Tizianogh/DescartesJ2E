package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modele.Banque;
import modele.Client;
import modele.ClientDejaExistantException;

class TestsBanque {

	private Banque banque = new Banque();
	
	@Test
	void testCreationClientPositif() throws ClientDejaExistantException {
		// GIVEN : pr�parer les donn�es du test
		String nom = "Dupond";
		String adresse = "Avenue de Versailles 75012 Paris";
		// WHEN : ex�cuter la fonction test�e
		Client c = banque.creerClient(nom, adresse);
		// THEN : v�rifier le r�sultat renvoy� par la fonction test�e
		assertNotNull(c);
		assertEquals("Dupond", c.getNom());
		assertEquals("Avenue de Versailles 75012 Paris", c.getAdresse());
		assertNotNull(banque.rechercherClient(nom, adresse));
	}
	
	@Test
	void testCreationClientNegatif() throws ClientDejaExistantException {
		// GIVEN : pr�parer les donn�es du test
		String nom = "Dupond";
		String adresse = "Avenue de Versailles 75012 Paris";
		banque.creerClient(nom, adresse);
		// WHEN : ex�cuter la fonction test�e
		assertThrows(ClientDejaExistantException.class, ()->{Client c = banque.creerClient(nom, adresse);});			
	}

}
