package app;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test findByDepartment ===");
		Department dep = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller obj : list) {
			System.out.println(obj);	
		}
		
		System.out.println("\n=== Test findAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test seller insert ===");
		System.out.print("Do you want to one seller insert?(y/n): ");
		char insert = sc.next().charAt(0);
		if (insert == 'y' || insert == 'Y') {
			Seller newSeller = new Seller(null, "toby", "toby@gmail.com", new Date(), 5000.00, dep);
			sellerDao.insert(newSeller);
			System.out.println("Inserted! New Id = " + newSeller.getId());
		}
		
		System.out.println("\n=== Test seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("marta waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== Test seller delete ===");
		System.out.print("enter id for delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted!");
		
		sc.close();
		
	}

}
