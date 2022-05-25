package Bidirection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Charsey {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String charseynum;
	private String type;
	@OneToOne(mappedBy = "charsey")
	private Vehicle model;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCharseynum() {
		return charseynum;
	}
	public void setCharseynum(String charseynum) {
		this.charseynum = charseynum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Vehicle getModel() {
		return model;
	}
	public void setModel(Vehicle model) {
		this.model = model;
	}
	
	

}
