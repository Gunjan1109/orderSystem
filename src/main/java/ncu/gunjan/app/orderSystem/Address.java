package ncu.gunjan.app.orderSystem;

public class Address {
	private String houseNo;
	private String state;
	private String city;
	private String pincode;
	private String type;
	
	@Override
	public int hashCode() {
		return houseNo.length();
	}
	
	public boolean equals(Object object) {
		if(this== object) {
			return true;
		}
		if(object instanceof Address) {
			Address a = (Address) object; // downcasting
			if(this.houseNo.equals(a.houseNo)) {
				return true;
			}
				
		}
		return false;
	}
	
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
