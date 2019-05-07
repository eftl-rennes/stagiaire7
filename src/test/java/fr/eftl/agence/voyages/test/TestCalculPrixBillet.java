package fr.eftl.agence.voyages.test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import fr.eftl.agence.voyages.prix.CalculPrixBillet;
import fr.eftl.agence.voyages.prix.CalculPrixUnitaire;


public class TestCalculPrixBillet {

	
	@Test
	public void prixBilletClasseEco() {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Paris", "Londres", "Eco");
		Assert.assertEquals(200, prixObtenu,0);
	}
	
}
