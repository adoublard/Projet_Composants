package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class DatabaseEntity{

	@Id
	@GeneratedValue
	private int id;
	private double prix;
	private String nom;
	private int stock;
	
	public DatabaseEntity() {

	  }

	  public DatabaseEntity(int id,double prix,String nom, int stock) {
	    this.prix = prix;
	    this.nom = nom;
	    this.stock = stock;
	  }

	  public int getId() {
	    return this.id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	public double getPrix() {
		return prix;
	}

	public void setPrix(double d) {
		this.prix = d;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

   
}
