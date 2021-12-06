package com.sarra.etudiants.entities;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Etudiant {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long idEtudiant;
 private String nom;
 @Column(name = "prenom")
 private String prenom;
 private String cin;

 @ManyToOne
 private Institut institut;
 
public Etudiant() {
	super();
}


public Etudiant(String nom, String prenom, String cin) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.cin = cin;
}


public Long getIdEtudiant() {
	return idEtudiant;
}
public void setIdEtudiant(Long idEtudiant) {
	this.idEtudiant = idEtudiant;
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
	this.prenom=prenom;
}

public String getCin() {
	return cin;
}
public void setCin(String cin) {
	this.cin = cin;
}


@Override
public String toString() {
	return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + "]";
}


public Institut getInstitut() {
	return institut;
}


public void setInstitut(Institut institut) {
	this.institut = institut;
}
 
 
 
}
