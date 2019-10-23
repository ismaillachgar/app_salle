package com.example.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;





@Entity
public class Sport {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  id;
	private String nom;
    @ManyToOne
    @JoinColumn(name="salle_id",  referencedColumnName = "id", insertable = true, updatable = true, nullable=false)
    private Salle salle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	public Sport( String nom, Salle salle) {
		super();
		
		this.nom = nom;
		this.salle = salle;
	}
	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
