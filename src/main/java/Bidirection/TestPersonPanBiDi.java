package Bidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestPersonPanBiDi {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Hema");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=new Person();
		p.setName("MOS");
		p.setEmail("MOS@gmail");
		p.setPhone(23456889);
		
		Pan pan=new Pan();
		pan.setName("MOS");
		pan.setAddress("banglore");
		pan.setPannum("BCD1235");
		
//		p.setPan(pan);
	pan.setPerson(p);
		
		et.begin();
		em.persist(p);
		em.persist(pan);
		et.commit();
		}


}
