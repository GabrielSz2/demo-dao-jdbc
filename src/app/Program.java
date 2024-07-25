package app;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "books");
		System.out.println(obj);
		
		Seller sl = new Seller(21, "bob", "bob@gmail.com", new Date(), 2000.00, obj);
		System.out.println(sl);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
	}

}
