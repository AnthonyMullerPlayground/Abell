package anthony.muller.celestia.abell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import anthony.muller.celestia.abell.model.Depot;
import anthony.muller.celestia.abell.model.DepotRepository;
import anthony.muller.celestia.abell.model.ItemProperty;
import anthony.muller.celestia.abell.model.ItemPropertyRepository;

@SpringBootApplication
public class AbellApplication extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(AbellApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AbellApplication.class, PingApplication.class);
    }
    
    @Bean
	public CommandLineRunner initDepot(DepotRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Depot("Jack Bauer"));
			repository.save(new Depot("Chloe O'Brian"));
			
			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Depot customer : repository.findAll()) {
				log.info(customer.toString());
			}
            log.info("");

			// fetch an individual customer by ID
			Depot customer = repository.findOne(1L);
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
            log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			for (Depot bauer : repository.findByName("Bauer")) {
				log.info(bauer.toString());
			}
            log.info("");
		};
	}
    
    @Bean
	public CommandLineRunner initProperties(ItemPropertyRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new ItemProperty("SI_NAME", "Formatting Sample"));
			repository.save(new ItemProperty("SI_CUID", "AQtkbbSqN4NOj3ydf.Sw1lY"));			
		};
	}
}