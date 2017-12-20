package tn.iset.stdMng.dl;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Etudiant implements Serializable {
	
	@Id @GeneratedValue
	private long idEtud;
	private String nomPrenom;
	private String adresse;
	private String email;
	private String tel;
	private String daten;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(String nomPrenom) {
		super();
		this.nomPrenom = nomPrenom;
	}
	public long getIdEtud() {
		return idEtud;
	}
	public void setIdEtud(long idEtud) {
		this.idEtud = idEtud;
	}
	public String getNomPrenom() {
		return nomPrenom;
	}
	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDaten() {
		return daten;
	}
	public void setDaten(String daten) {
		this.daten = daten;
	}
	
	
	

}
