package app;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sell = DaoFactory.createSellerDao();
		
		Seller sel = sell.findById(3);
		
		System.out.println(sel);
		
	}

}
