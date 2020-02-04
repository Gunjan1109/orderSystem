package ncu.gunjan.app.orderSystem;

import java.util.Comparator;

public class PriceCompare implements Comparator<Product>{
	public int compare(Product p1 , Product p2) {
		if(p1.getAmount() <  p2.getAmount()) return -1;
		if(p1.getAmount() >  p2.getAmount()) return 1;
		else 
			return 0;
	}
}
