package anthony.muller.celestia.abell.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="PROPERTY")
@Entity
public class ItemProperty {

	@Id
	private String name;
	
	private String value;
	private String type;
	
	public ItemProperty(String name, String value) {
		this.name	= name;
		this.value	= value;
		this.type	= "String";
	}
	
	protected ItemProperty() {}
	
	public String getValue() {
		return value;
	}
	
	public String getType() {
		return type;
	}
}
