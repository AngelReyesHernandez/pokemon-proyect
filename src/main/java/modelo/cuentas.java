package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "pokemon")
public class cuentas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String abilities;
	private String base_experiences;
	private String held_item;
	private String name;
	private String location_area_enconters;
	
	
	
	
	
	public cuentas(Long id, String abilities, String base_experiences, String held_item, String name,
			String location_area_enconters) {
		super();
		this.id = id;
		this.abilities = abilities;
		this.base_experiences = base_experiences;
		this.held_item = held_item;
		this.name = name;
		this.location_area_enconters = location_area_enconters;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAbilities() {
		return abilities;
	}
	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}
	public String getBase_experiences() {
		return base_experiences;
	}
	public void setBase_experiences(String base_experiences) {
		this.base_experiences = base_experiences;
	}
	public String getHeld_item() {
		return held_item;
	}
	public void setHeld_item(String held_item) {
		this.held_item = held_item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation_area_enconters() {
		return location_area_enconters;
	}
	public void setLocation_area_enconters(String location_area_enconters) {
		this.location_area_enconters = location_area_enconters;
	}

	
	

	
	
	
	
	
}
