package tn.iset.stdMng.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.iset.stdMng.dl.Etudiant;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Long> {

	
    public List<Etudiant> findByNomPrenom(String nom);
    public List<Etudiant> findByNomPrenomOrAdresse(String nom,String adr);
	
	@Query("select p from Etudiant p where p.adresse=:nom")
	public List<Etudiant> rechercherParAdresse(@Param("nom") String nom);
	
}
