package com.example.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;



@Entity
public class Salle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String nom;
private String image;
private String tel;
private String ville;
private String adresse;
@OneToMany(mappedBy="salle")
private List<Sport> sports=new ArrayList<>();
@OneToMany(mappedBy="salle")
private List<User> users=new ArrayList<>();
@OneToMany(mappedBy="salle")
private List<Payement> payement=new ArrayList<Payement>();
public List<User> getUsers() {
	return users;
}
public void setUsers(List<User> users) {
	this.users = users;
}
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

public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public List<Sport> getSports() {
	return sports;
}
public void setSports(List<Sport> sports) {
	this.sports = sports;
}
public Salle( String nom, String image, String tel, String ville, String adresse) {
	super();
	
	this.nom = nom;
	this.image = image;
	this.tel = tel;
	this.ville = ville;
	this.adresse = adresse;

}
public Salle() {
	super();
	// TODO Auto-generated constructor stub
}


}
