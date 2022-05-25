package Bidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonAndPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Hema");
		EntityManager em=entityManagerFactory.createEntityManager();
		
		Pan p=em.find(Pan.class, 1);
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getPannum());
		
		System.out.println(p.getPerson().getId());
		System.out.println(p.getPerson().getName());
		System.out.println(p.getPerson().getPhone());
		
		System.out.println("-----------------");
		Person p1=em.find(Person.class, 1);
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getPhone());
		
		
		System.out.println(p1.getPan().getId());
		System.out.println(p1.getPan().getName());
		System.out.println(p1.getPan().getAddress());
		System.out.println(p1.getPan().getPannum());

		
		
	}
}
