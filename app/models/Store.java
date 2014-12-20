package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity
public class Store extends Model {
    private int nextSaleNumber;
    public String test;

    public void recordSale(String cashier, String register, Sale s){
    }

}
