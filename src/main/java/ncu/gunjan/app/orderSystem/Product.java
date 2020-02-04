package ncu.gunjan.app.orderSystem;

import java.util.Comparator;

public class Product implements Comparable<Product>{
	private String name;
	private int quantity;
	private float amount;
	private int rating;
	
	
	@Override
	public String toString() {
		return "\nName : " + name + "\nQuantity : " + quantity + "\nAmount : " + amount + "\nRating : " + rating + "\n";
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
		
//	public int compare(Product compareProduct1, Product compareProduct2) {
//		float product1 = compareProduct1.amount;
//		float product2 = compareProduct2.amount;
//		return (int)(product2 - product1);		
//	}
	@Override
	public int compareTo(Product compareProduct) {
		return ((Integer)this.rating).compareTo(compareProduct.rating);
	}
	
}
