package anthony.muller.celestia.abell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AbellApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AbellApplication.class, HelloWorld.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(new Object[] {AbellApplication.class, HelloWorld.class}, args);
    }
}