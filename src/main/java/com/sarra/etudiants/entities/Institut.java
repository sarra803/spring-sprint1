package com.sarra.etudiants.entities;

import java.util.List;






import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Institut {
	
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long idIns;
 private String nom;
 private double capacite;
 
 @JsonIgnore
 @OneToMany(mappedBy="institut")
 private List<Etudiant> Etudiants;
 

 
}
