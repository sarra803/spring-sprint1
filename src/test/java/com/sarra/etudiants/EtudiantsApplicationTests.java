package com.sarra.etudiants;


import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sarra.etudiants.entities.Etudiant;
import com.sarra.etudiants.entities.Institut;
import com.sarra.etudiants.repos.EtudiantRepository;

@SpringBootTest
class EtudiantsApplicationTests {
@Autowired
	private EtudiantRepository EtudiantRepository;
	@Test
	public void testCreateEtudiant() {
		Etudiant Etud = new Etudiant("sassi","saif" ,"09893566");
		EtudiantRepository.save(Etud);
	}
	@Test
	public void testFindEtudiant()
	{
		Etudiant e = EtudiantRepository.findById(1L).get(); 
	System.out.println(e);
	}
	@Test
	public void testUpdateEtudiant()
	{
		Etudiant e = EtudiantRepository.findById(1L).get();
	e.setNom("s");
	EtudiantRepository.save(e);
	}
	public void testDeleteEtudiant()
	{
		EtudiantRepository.deleteById(1L);;
	}
	 
	@Test
	public void testListerTousEtudiants()
	{
	List<Etudiant> etuds = EtudiantRepository.findAll();
	for (Etudiant p : etuds)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindEtudiantByNom()
	{
		List<Etudiant> et = EtudiantRepository.findByNom("sassi");
		for (Etudiant p : et)
		{
		System.out.println(p);
		}
}
	
	@Test
	public void testFindEtudiantByNomContains()
	{
		List<Etudiant> et = EtudiantRepository.findByNomContains("s");
		for (Etudiant e: et)
		{
		System.out.println(e);
		}
}	
	@Test
	public void testfindByIdNom()
	{
	List<Etudiant> e = EtudiantRepository.findByIdNom("sassi" ,(long) 2);
	for (Etudiant etud: e )
	{
	System.out.println(etud);
	}

	}
	@Test
	public void testfindByInstitut()
	{
	Institut insti = new Institut();
	insti.setIdIns(1L);
	List<Etudiant> etuds = EtudiantRepository.findByInstitut(insti);
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}

	}
	@Test
	public void findByInstitutIdIns()
	{
	List<Etudiant> etuds = EtudiantRepository.findByInstitutIdIns(1L);
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}

	}
@Test
	public void findByOrderByNomAsc()
	{
	List<Etudiant> etuds =EtudiantRepository.findByOrderByNomAsc();
	for (Etudiant p : etuds)
	{
	System.out.println(p);
	}

	}
	@Test
	public void trierEtudiantsNomPrenom()
	{
	List<Etudiant> etuds = EtudiantRepository.trierEtudiantsNomPrenom();
	for (Etudiant p : etuds)
	{
	System.out.println(p);
	}

	}
}



