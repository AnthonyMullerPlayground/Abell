package anthony.muller.celestia.abell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import anthony.muller.celestia.abell.model.DepotRepository;

@RestController
public class PingApplication {

	@Autowired
	private DepotRepository depotRepository;
	
    @RequestMapping("/ping")
    String home() {
        return "pong";
    }
    
    @RequestMapping("/depot")
    String getDepot() {
    	return depotRepository.findByName("Jack Bauer").toString();
    }
}