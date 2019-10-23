package com.example.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String cin;
	private String nom;
	private String prenom;
	private String adress;
	private String ville;
	@Temporal(TemporalType.DATE)
	private Date dateNaisance;
	@Temporal(TemporalType.DATE)
	private Date date_abonnement;
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	 @JoinColumn(name="salle_id",  referencedColumnName = "id", insertable = true, updatable = true, nullable=false)
	private Salle salle;
	@OneToMany(mappedBy="user")
	private List<Payement> payement=new ArrayList<Payement>();
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Date getDateNaisance() {
		return dateNaisance;
	}
	public void setDateNaisance(Date dateNaisance) {
		this.dateNaisance = dateNaisance;
	}
	public Date getDate_abonnement() {
		return date_abonnement;
	}
	public void setDate_abonnement(Date date_abonnement) {
		this.date_abonnement = date_abonnement;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public List<Payement> getPayement() {
		return payement;
	}
	public void setPayement(List<Payement> payement) {
		this.payement = payement;
	}
	public int getId() {
		return id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String cin, String nom, String prenom, String adress, String ville, Date dateNaisance,
			Date date_abonnement, Salle salle, List<Payement> payement) {
		super();
		this.id = id;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.ville = ville;
		this.dateNaisance = dateNaisance;
		this.date_abonnement = date_abonnement;
		this.salle = salle;
		this.payement = payement;
	}
	
    
}
