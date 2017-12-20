package tn.iset.stdMng.bl;

import java.util.List;

import tn.iset.stdMng.dl.Etudiant;

public interface IMetierEtudiant {
	
	public Etudiant add(Etudiant e);
	public Etudiant update(long key,Etudiant e);
	public boolean remove(Etudiant e);
	public List<Etudiant> findAll();
	public Etudiant findById(long key);
	public List<Etudiant> recherheParNom(String nom);
	public List<Etudiant> recherheParAdresse(String adresse);

}
