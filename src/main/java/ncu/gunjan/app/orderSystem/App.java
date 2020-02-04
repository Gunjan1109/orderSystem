package ncu.gunjan.app.orderSystem;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Scanner scanner=new Scanner(System.in);
    	ApplicationContext ac = 
				new ClassPathXmlApplicationContext("orderSpring.xml");
    	
    	IOrderProcess obj = (IOrderProcess) ac.getBean("orderprocess");
    	
    	System.out.println("Enter Name");   	
    	String userName = scanner.next().toUpperCase();
    	obj.printCustomer(userName);
    	
    	System.out.println("Which Adress you want to See\nResidential\tOffice");
    	
    	String addressChoice = scanner.next().toUpperCase();
    	obj.printAddress(addressChoice,userName);
    	
    	System.out.println("Enter order Id");
    	int orderId = scanner.nextInt();
    	
    	obj.printOrder(userName,orderId);
    	
    	
    }
}
