package anthony.muller.celestia.abell.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
    private String name;
	
    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Item[name='%s']", name);
    }
}
