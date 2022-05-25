package Bidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetVehicleandCharsey {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hema");
		EntityManager em=emf.createEntityManager();
	
		Vehicle v=em.find(Vehicle.class, 2);
				if(v!=null) {
					System.out.println(v.getId());
					System.out.println(v.getCost());
					System.out.println(v.getName());
					System.out.println(v.getCharsey().getId());
					System.out.println(v.getCharsey().getCharseynum());
					
				}
				else {
					System.out.println("no record");
				}
	}
}
