package com.pluralsight.NorthwindTradersAPI.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(@RequestParam(defaultValue = "country", required = false) String country) {

        if (!country.equals("country")) {
            return "Hello " + country;
        }
        return "Hello World";

    }
}
