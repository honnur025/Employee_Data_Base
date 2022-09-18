package emp;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeImps implements EmployeeDB{
	Scanner sc= new Scanner(System.in);
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("devil");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Employee e=new Employee();
	public void addEmployee() {
		System.out.println("Enter id,Name,Salary,Disignation");
		int id=sc.nextInt();
		String name=sc.next();
		double sal=sc.nextDouble();
		String disig=sc.next();

		e.setId(id);
		e.setName(name);
		e.setSalary(sal);
		e.setDisig(disig);

		et.begin();
		em.persist(e);
		et.commit();
		System.out.println("Data Is Saved");
	}

	public void UpdateEmployee() {
		System.out.println("Enter id");
		int id=sc.nextInt();
		Employee e=em.find(Employee.class, id);
		if(e!=null) {
			System.out.println("Enter Choice\n1:Update Name\n2:Update Salary\n3:Update Disignation\n");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("Enter Name");
				String name=sc.next();
				e.setName(name);
				System.out.println("Name Is Updated");
				break;
			case 2:
				System.out.println("Enter Salary");
				Double sal=sc.nextDouble();
				e.setSalary(sal);
				System.out.println("Salary Is Updated");
				break;
			case 3:
				System.out.println("Enter Disignation");
				String desig=sc.next();
				e.setDisig(desig);
				System.out.println("Designation Is Updated");
				break;
			default :
				System.out.println("Invalid Choice");
			}
		}
	}

	public void displayEmployee() {
		System.out.println("Enter Id");
		int id=sc.nextInt();
		Employee e=em.find(Employee.class, id);
		if(e!=null && id==e.getId()) {
			System.out.println("["+"\nId =>"+e.getId()+", Name =>"+e.getName()+", Salary =>"+e.getSalary()+", Designation =>"+e.getDisig()+"\n"+"]");
		}else {
			System.err.println("Data Not Found");
		}
	}

	public void deleteEmployee() {
		System.out.println("Enter Id :");
		int id=sc.nextInt();
		Employee e=em.find(Employee.class, id);
		if(e!=null) {
			et.begin();
			em.remove(e);
			et.commit();
			System.out.println("Data Is Deleted");
		}else {
			System.err.println("Data Not Found");
		}
	}

}
