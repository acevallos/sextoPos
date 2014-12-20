package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Catalog extends Model {

	public Product findProduct(int code) {
		return null;
	}

}
