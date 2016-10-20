package anthony.muller.celestia.abell.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemElementRepository extends JpaRepository<ItemElement, Serializable> {

	List<ItemElement> findByName(String name);
}
