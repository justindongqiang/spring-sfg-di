package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructionInjectionController {

    private final GreetingService greetingService;

    @Autowired//optional
    // Qualifier for construction dependency injection
    public ConstructionInjectionController(@Qualifier("anotherGreetingServiceImpl") GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
