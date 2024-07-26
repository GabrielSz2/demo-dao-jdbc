package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao dao = DaoFactory.createDepartmentDao();
		List<Department> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("=== Test findById ===");
		Department dep = dao.findById(2);
		System.out.println(dep);
		
		
		System.out.println("\n=== Test findAll ===");
		list = dao.findAll();
		for(Department x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("\n=== Teste insert department ===");
		Department newDeparment = new Department(null, "Ti");
		dao.insert(newDeparment);
		System.out.println("Done! insert completed");
		
		
		System.out.println("\n=== Test delete department ===");
		System.out.print("Insert Id for deleted: ");
		int id = sc.nextInt();
		dao.deleteById(id);
		System.out.println("Deleted completed!");
		
		
		System.out.println("\n=== Test update department ===");
		dep = dao.findById(7);
		dep.setName("Developer");
		dao.update(dep);
		System.out.println("Sucess!");
		
		
	}

}
