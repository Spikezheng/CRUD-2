package pojo;

import java.util.Set;

public class Category {
	private int id;
	private String name;
	private Set<Product> products;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public Set<Product> getProducts(){
		return this.products;
	}
}
