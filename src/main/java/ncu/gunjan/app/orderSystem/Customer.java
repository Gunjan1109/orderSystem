package ncu.gunjan.app.orderSystem;

import java.util.List;
import java.util.Set;


public class Customer {
	private int id;
	private String name;
	private char gender;
	private float balance;
	private Set<Address> address;
	private List<Order> order;
	
	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		return name.length();
	}
	
	public boolean equals(Object object) {
		if(this== object) {
			return true;
		}
		if(object instanceof Customer) {
			Customer c = (Customer) object; // downcasting
			if(this.name.equals(c.name)) {
				return true;
			}
				
		}
		return false;
	}

	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}
