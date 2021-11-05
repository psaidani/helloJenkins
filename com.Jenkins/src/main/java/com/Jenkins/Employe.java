package com.Jenkins;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Employe {
	
	protected int numEmploye;
	protected String nom, prenom, telephone;
	protected LocalDate dateNaissance, dateEmbauche;
	protected  double salaire, prime;
	
	public Employe(String nom, String prenom, String telephone, LocalDate dateNaissance, LocalDate dateEmbauche) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
		
		calculPrime();
		
		numEmploye++;
	}
	
	public void calculPrime()
	{
		long anciennete = ChronoUnit.YEARS.between(LocalDate.now(), dateEmbauche);
		
		if(anciennete < 5)
		{
			salaire *= 1.02;
		}
		else
		{
			salaire *= 1.07;
		}
	}
	
	
	public abstract void calculSalaire();

	public int getNumEmploye() {
		return numEmploye;
	}

	public void setNumEmploye(int numEmploye) {
		this.numEmploye = numEmploye;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public LocalDate getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public double getPrime() {
		return prime;
	}

	public void setPrime(double prime) {
		this.prime = prime;
	}
	
	
	

}
