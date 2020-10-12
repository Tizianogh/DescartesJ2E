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
		// GIVEN : préparer les données du test
		String nom = "Dupond";
		String adresse = "Avenue de Versailles 75012 Paris";
		// WHEN : exécuter la fonction testée
		Client c = banque.creerClient(nom, adresse);
		// THEN : vérifier le résultat renvoyé par la fonction testée
		assertNotNull(c);
		assertEquals("Dupond", c.getNom());
		assertEquals("Avenue de Versailles 75012 Paris", c.getAdresse());
		assertNotNull(banque.rechercherClient(nom, adresse));
	}
	
	@Test
	void testCreationClientNegatif() throws ClientDejaExistantException {
		// GIVEN : préparer les données du test
		String nom = "Dupond";
		String adresse = "Avenue de Versailles 75012 Paris";
		banque.creerClient(nom, adresse);
		// WHEN : exécuter la fonction testée
		assertThrows(ClientDejaExistantException.class, ()->{Client c = banque.creerClient(nom, adresse);});			
	}

}
