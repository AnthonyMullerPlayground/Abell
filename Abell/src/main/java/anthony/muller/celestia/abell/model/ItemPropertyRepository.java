package anthony.muller.celestia.abell.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPropertyRepository extends JpaRepository<ItemProperty, Serializable> {

	List<ItemProperty> findByName(String name);
}
