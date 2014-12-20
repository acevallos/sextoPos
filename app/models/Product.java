package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity
public class Product extends Model {
	private int code;
	private String description;
	private float price;

}
