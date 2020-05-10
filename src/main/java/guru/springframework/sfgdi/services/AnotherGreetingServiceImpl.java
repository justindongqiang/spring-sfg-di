package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class AnotherGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World- from another one!";
    }
}
