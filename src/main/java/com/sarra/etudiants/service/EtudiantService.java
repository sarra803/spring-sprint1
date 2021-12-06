package com.sarra.etudiants.service;

import java.util.List;



import com.sarra.etudiants.entities.Etudiant;
import com.sarra.etudiants.entities.Institut;

public interface EtudiantService {
	Etudiant saveEtudiant(Etudiant p);
	Etudiant updateEtudiant(Etudiant p);
		void deleteEtudiant(Etudiant p);
		 void deleteEtudiantById(Long id);
		 Etudiant getEtudiant(Long id);
		List<Etudiant> getAllEtudiants();
		List<Etudiant> findByNom(String nom);
		List<Etudiant> findByNomContains(String nom);
		List<Etudiant> findByIdNom (String nom, Long id);
		List<Etudiant> findByInstitut (Institut institut);
		List<Etudiant> findByInstitutIdIns(Long id);
		List<Etudiant> findByOrderByNomAsc();
		List<Etudiant> trierEtudiantsNomPrenom();
		List<Etudiant> findAllEtudiants();
		}


