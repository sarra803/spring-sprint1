package com.sarra.etudiants.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.sarra.etudiants.entities.Etudiant;
import com.sarra.etudiants.entities.Institut;
import com.sarra.etudiants.repos.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements EtudiantService {
	@Autowired
	private EtudiantRepository EtudiantRepository;
	@Override
	public Etudiant saveEtudiant(Etudiant p) {
			return EtudiantRepository.save(p);
		
	}
	@Override
	public Etudiant updateEtudiant(Etudiant p) {
		return EtudiantRepository.save(p);	
	}

	@Override
	public void deleteEtudiant(Etudiant p) {
		EtudiantRepository.delete(p);		
	}

	@Override
	public void deleteEtudiantById(Long id) {
		EtudiantRepository.deleteById(id);
		
	}

	@Override
	public Etudiant getEtudiant(Long id) {
		 return EtudiantRepository.findById(id).get();

	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		 return EtudiantRepository.findAll();

	}
	@Override
	public List<Etudiant> findByNom(String nom) {
		return EtudiantRepository.findByNom(nom);
	}
	@Override
	public List<Etudiant> findByNomContains(String nom) {
		return EtudiantRepository.findByNomContains(nom);
		
	}
	@Override
	public List<Etudiant> findByIdNom(String nom, Long id) {
		return  EtudiantRepository.findByIdNom(nom,id);		
	}
	@Override
	public List<Etudiant> findByInstitut(Institut institut) {
		return EtudiantRepository.findByInstitut(institut);		
		
	}
	@Override
	public List<Etudiant> findByInstitutIdIns(Long id) {
		return EtudiantRepository.findByInstitutIdIns(id);		
	}
	@Override
	public List<Etudiant> findByOrderByNomAsc() {
		return EtudiantRepository.findByOrderByNomAsc();		
	}
	@Override
	public List<Etudiant> trierEtudiantsNomPrenom() {
		return EtudiantRepository.trierEtudiantsNomPrenom();		
	}
	@Override
	public List<Etudiant> findAllEtudiants() {
		return EtudiantRepository.findAll();
	}

}
