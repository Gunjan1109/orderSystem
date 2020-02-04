package ncu.gunjan.app.orderSystem;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class OrderProcess implements IOrderProcess {
	Scanner sc = new Scanner(System.in);
	private Set<Customer> customer;
	private List<Product> product2;
	PriceCompare priceCompare;
	//private Address address;

	public Set<Customer> getCustomer() {
		return customer;
	}

	public PriceCompare getPriceCompare() {
		return priceCompare;
	}

	public void setPriceCompare(PriceCompare priceCompare) {
		this.priceCompare = priceCompare;
	}


	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	
	public List<Product> getProduct2() {
		return product2;
	}

	public void setProduct2(List<Product> product2) {
		this.product2 = product2;
	}
	
	public void printCustomer(String userName) {
		boolean isNamePresent = false;
		for (Customer customers : customer) {
			if(customers.getName().equals(userName.toUpperCase())) {
				System.out.println("Name : " + customers.getName());
				System.out.println("Id : " + customers.getId());
				System.out.println("Gender : "+ customers.getGender());
				System.out.println("Balance in account : " + customers.getBalance());
				isNamePresent = true;
				break;
			}
		}
		if(isNamePresent == false) {
			System.out.println("Wrong Name");
			System.exit(0);
		}
	}
	
	

	public void printAddress(String addressChoice, String userName) {
		boolean isAddressPresent = false;
		for (Customer customers : customer) {
			for(Address address : customers.getAddress()) {
				if(customers.getName().equals(userName.toUpperCase()) && address.getType().equals(addressChoice.toUpperCase())) {				
				System.out.println("Building " +address.getHouseNo());
				System.out.println("City : " + address.getCity());
				System.out.println("State : " + address.getState());
				System.out.println("Pincode : " + address.getPincode());
				isAddressPresent = true;
			}
			}
	}
		if(isAddressPresent == false) {
			System.out.println("Wrong Choice");
			System.exit(0);
		}
	}
	
	public void printOrder(String userName , int orderId) {		
		boolean isOrderPresent = false;
		for (Customer customers : customer) {
			for(Order order : customers.getOrder()) {
				if(customers.getName().equals(userName) && order.getId() == orderId) {
					System.out.println("You ordered this order on " + order.getDate() + " of Rupees " + order.getAmount() + "\nProducts are");
					for(Product product : order.getProduct()) {
						System.out.println("Name : " + product.getName());
						System.out.println("Quantity : " + product.getQuantity());
						System.out.println("Price : " + product.getAmount());
						System.out.println("Rating : " + product.getRating());
						isOrderPresent = true;
						product2.add(product);
						//System.out.println("After add");
						
					}
				}
			}
		}
		
		System.out.println("Want to sort by rating or price");
		String sort = sc.next().toUpperCase();
		
		if(sort.equals("RATING")) {
			Collections.sort(product2);
			//System.out.println("After Sort");
			System.out.println(product2);
//			for (Customer customers : customer) {
//				for(Order order : customers.getOrder()) {
//					if(customers.getName().equals(userName) && order.getId() == orderId) {
//						System.out.println("You ordered this order on " + order.getDate() + " of " + order.getAmount() + "\nProducts are");
//						for(Product product : order.getProduct()) {
//							System.out.println("Name : " + product.getName());
//							System.out.println("Quantity : " + product.getQuantity());
//							System.out.println("Price : " + product.getAmount());
//							product.a
//							
//						}
//					}
//				}
//			}
		}
	
		
		
		
//		else {
//			System.out.println("Else executed");
//			for (Customer customers : customer) {
//				for(Order order : customers.getOrder()) {
//					if(customers.getName().equals(userName) && order.getId() == orderId) {
//						for(Product product : order.getProduct()) {
//							System.out.println("in loop");
//							product2.add(product);
//						}
//						}
//						}
		else {
			Collections.sort(product2,priceCompare);
			System.out.println(product2);
		}
		
		if(isOrderPresent == false) {
			System.out.println("Wrong OrderId");
			System.exit(0);
		}
		
	}
	
}

