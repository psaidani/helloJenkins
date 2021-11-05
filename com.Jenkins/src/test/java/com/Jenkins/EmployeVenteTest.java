package com.Jenkins;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class EmployeVenteTest {
	
	@Test
	public void calculSalaireCorrectTest()
	{
		EmployeVente ev = new EmployeVente("Paul", "Pierre", "0605", LocalDate.now(), LocalDate.now(), 10000);
		
		ev.calculSalaire();
		
		assertTrue(ev.getSalaire() == 2900);
	}
	
	@Test
	public void calculSalaireIncorrectTest()
	{
		EmployeVente ev = new EmployeVente("Paul", "Pierre", "0605", LocalDate.now(), LocalDate.now(), 10000);
		
		ev.calculSalaire();
		
		assertFalse(ev.getSalaire() == 2700);
	}

}
