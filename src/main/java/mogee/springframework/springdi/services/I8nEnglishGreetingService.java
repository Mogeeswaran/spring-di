package mogee.springframework.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i8nService")
public class I8nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World -EN";
    }
}
