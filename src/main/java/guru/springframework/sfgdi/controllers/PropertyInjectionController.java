package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectionController {
    public GreetingService greetingService;

//    public PropertyInjectionController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
