package Bidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteVehicleAndCharsey {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hema");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Vehicle v=em.find(Vehicle.class, 3);
//		Charsey c=em.find(Charsey.class, 1);
//
//		Vehicle v=new Vehicle();
//		v.setName("Audi");
//		v.setCost(4000000);
//		v.setCharsey(c);
//		c.setModel(v);
		
		
		if(v!=null) {
		et.begin();
		em.remove(v);
		et.commit();
		}
		else {
			System.out.println("no record");
		}
	}
}
