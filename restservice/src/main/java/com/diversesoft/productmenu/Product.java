package com.diversesoft.productmenu;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int id;
    @Column(name = "name")
	private String name;
    @Column(name = "parent_id")
    private int parent_id;
	
    public Product(){
    	
    }
    public Product(int id, String name, int parent_id){
    	this.id = id;
    	this.name = name;
    	this.parent_id = parent_id;
    }
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
}
