package ncu.gunjan.app.orderSystem;

public interface IOrderProcess {
	public void printCustomer(String userName);
	public void printAddress(String addressChoice,String userName);
	public void printOrder(String userName, int orderId);
}
