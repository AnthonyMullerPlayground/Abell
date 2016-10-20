package anthony.muller.celestia.abell.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Depot {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    @OneToMany(mappedBy="depot", cascade=CascadeType.ALL)
    private List<Space> spaces;
    
    protected Depot() {}

    public Depot(String name) {
        this.name = name;
    }
    
    public Long getId() {
		return id;
	}
    
    public String getName() {
		return name;
	}

    public List<Space> getSpaces() {
		return spaces;
	}
    
    @Override
    public String toString() {
        return String.format("Depot[id=%d, name='%s']", id, name);
    }
}
