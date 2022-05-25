package Bidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCharcyAndVehicle {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hema");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Charsey c=new Charsey();
		c.setType("4wheel");
		c.setCharseynum("Benz1233");
		
		Vehicle v=new Vehicle();
		v.setName("Benz");
		v.setCost(5000000);
		v.setCharsey(c);
		c.setModel(v);
		
		et.begin();
		em.persist(v);
		et.commit();
	}

}
