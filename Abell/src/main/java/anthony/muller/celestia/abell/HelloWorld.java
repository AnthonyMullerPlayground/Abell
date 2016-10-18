package anthony.muller.celestia.abell;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    String home() {
        return "Hello World !!!";
    }
}