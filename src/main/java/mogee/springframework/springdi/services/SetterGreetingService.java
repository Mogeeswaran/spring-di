package mogee.springframework.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi Folks--Setter";
    }
}
