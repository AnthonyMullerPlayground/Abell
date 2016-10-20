package anthony.muller.celestia.abell.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepotRepository extends JpaRepository<Depot, Long> {

	List<Depot> findByName(String name);
}
