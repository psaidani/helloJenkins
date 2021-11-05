package com.Jenkins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionEmploye {
	
	List<Employe> listeEmploye = new ArrayList<Employe>();
	Scanner sc = new Scanner(System.in);
	
	public GestionEmploye() {};
	
	public void menu()
	{
		System.out.println("Saisir 1 pour créer, 2 pour modifier, 3 pour supprimer et 4 pour afficher");
		
		
		int choix = sc.nextInt();
		
		switch (choix) {
		case 1: creerEmploye();
			
			break;
			
		case 2 : modifierEmploye();
		
		break;
		
		case 3 : supprimerEmploye();
		
		break;
		
		case 4 : afficherEmploye();
		
		break;

		default:
			break;
		}
	}
	
	public void creerEmploye()
	{
		//Employe e = new EmployeVente("Paul", "Pierre", "0601020304", LocalDate.now(), LocalDate.now(), 10000);
		
		String nom, prenom, telephone;
		LocalDate dateNaissance, dateEmbauche;
		int type;
		Employe e = null;
		
		System.out.println("Saisir 1 pour employé vente et 2 pour employé production");
		type = sc.nextInt();
		
		while (type == 1 || type == 2) 
		{
			System.out.println("Saisir le nom : ");
			nom = sc.next();
			System.out.println("Saisir le prenom : ");
			prenom = sc.next();
			System.out.println("Saisir le telephone : ");
			telephone = sc.next();
			dateNaissance = LocalDate.of(1970, 6, 13);
			dateEmbauche = LocalDate.of(2018, 6, 13);

			if (type == 1) 
			{
				System.out.println("Saisir le CA :");
				double CA = sc.nextDouble();

				e = new EmployeVente(nom, prenom, telephone, dateNaissance, dateEmbauche, CA);
			} 
			else 
			{
				System.out.println("Saisir le nombre d'unités :");
				int nbUnite = sc.nextInt();

				e = new EmployeProduction(nom, prenom, telephone, dateNaissance, dateEmbauche, nbUnite);
			}
			
			System.out.println("Saisir 1 pour employé vente et 2 pour employé production ou autre pour sortir");
			type = sc.nextInt();
		}
		
	}
	
	public void modifierEmploye()
	{
		Employe e = chercherEmploye();
		
		System.out.println("Saisir : \n 1 : nom, \n 2 : prenom, \n 3 : telephone,...");
		int choix = sc.nextInt();
		
		while(choix >= 1 && choix <= 8)
		{
			switch (choix) {
			case 1:
				System.out.println("Saisir le nouveau nom");
				String nom = sc.next();
				
				e.setNom(nom); //listeEmploye.get(numE+1)/setNom(nom);
				
				break;

			default:
				break;
			}
		}
		
	}
	
	public void supprimerEmploye()
	{
		System.out.println("Saisir le numéro d'employé à supprimer : ");
		int numE = sc.nextInt();
		
		listeEmploye.remove(numE+1);
	}
	
	public void afficherEmploye()
	{
		Employe e = chercherEmploye();
		
		System.out.println("nom : " + e.getNom() + ", prénom : " + e.getPrenom() + ", ...");
	}
	
	public Employe chercherEmploye()
	{
		System.out.println("Saisir le numéro d'employé : ");
		int numE = sc.nextInt();
		
		Employe e = listeEmploye.get(numE+1);
		
		return e;
	}

}
