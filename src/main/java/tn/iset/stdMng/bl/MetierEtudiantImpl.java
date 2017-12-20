package tn.iset.stdMng.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;




import tn.iset.stdMng.dal.IEtudiantRepository;
import tn.iset.stdMng.dl.Etudiant;

@Service("metierEtud")
public class MetierEtudiantImpl implements IMetierEtudiant {
	
	@Autowired
	private IEtudiantRepository repositoryEtudiant;

	public Etudiant add(Etudiant e) {
		// TODO Auto-generated method stub
		
		return repositoryEtudiant.save(e);
	}

	public Etudiant update(long key, Etudiant e) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Etudiant e) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Etudiant> findAll() {
		// TODO Auto-generated method stub
		return repositoryEtudiant.findAll();
	}

	public Etudiant findById(long key) {
		// TODO Auto-generated method stub
		return null;
	}

	public IEtudiantRepository getRepositoryEtudiant() {
		return repositoryEtudiant;
	}

	public void setRepositoryEtudiant(IEtudiantRepository repositoryEtudiant) {
		this.repositoryEtudiant = repositoryEtudiant;
	}

	public List<Etudiant> recherheParNom(String nom) {
		// TODO Auto-generated method stub
		return repositoryEtudiant.findByNomPrenom(nom);
	}

	public List<Etudiant> recherheParAdresse(String adresse) {
		// TODO Auto-generated method stub
		return repositoryEtudiant.rechercherParAdresse(adresse);
	}

	
	

}
