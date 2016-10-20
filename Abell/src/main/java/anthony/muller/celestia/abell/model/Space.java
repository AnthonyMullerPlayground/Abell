package anthony.muller.celestia.abell.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Space {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
    
    @ManyToOne
    private Depot depot;
    
    protected Space() {}
    
    public Long getId() {
		return id;
	}
    
    public String getName() {
		return name;
	}
    
    public Depot getDepot() {
		return depot;
	}
}
