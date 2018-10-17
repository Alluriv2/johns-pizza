package com.learnathon.jr.pizzashopapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PizzaRestController {

    @RequestMapping("/pizza")
    public String getPizzas() {
        return "Pizzas are Unhealthy, but yummy!!!";
    }
}