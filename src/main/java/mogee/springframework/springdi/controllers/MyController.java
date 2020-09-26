package mogee.springframework.springdi.controllers;

import mogee.springframework.springdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final PrimaryGreetingService primaryGreetingService;

    public MyController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }

    public String sayHello(){
        return primaryGreetingService.sayGreeting();
    }
}
