package com.example.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Payement {
	@Id
  private int id;
	@Temporal(TemporalType.DATE)
  private Date date_payement;
  private Double montant;
  @ManyToOne
  @JoinColumn(name="user_id",  referencedColumnName = "id", insertable = true, updatable = true, nullable=false)
  private User user;
  @ManyToOne
  @JoinColumn(name="salle_id",  referencedColumnName = "id", insertable = true, updatable = true, nullable=false)
  private Salle salle;
public Date getDate_payement() {
	return date_payement;
}
public void setDate_payement(Date date_payement) {
	this.date_payement = date_payement;
}
public Double getMontant() {
	return montant;
}
public void setMontant(Double montant) {
	this.montant = montant;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Salle getSalle() {
	return salle;
}
public void setSalle(Salle salle) {
	this.salle = salle;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Payement(Date date_payement, Double montant, User user, Salle salle) {
	super();
	this.date_payement = date_payement;
	this.montant = montant;
	this.user = user;
	this.salle = salle;
}
  

}
