package mogee.springframework.springdi.controllers;

import mogee.springframework.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I8nController {
    private final GreetingService greetingService;

    public I8nController(@Qualifier("i8nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
