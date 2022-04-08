package com.seannavery.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
    @RequestMapping("/")
    public String index(
    		@RequestParam(value="name", required=false) String firstName,
    		@RequestParam(value="last_name", required=false) String lastName) {
    	if(firstName != null && lastName != null) {	
    		return "You searched for: " + firstName + " " + lastName;
    	}
    	else {
    		return "Hello human!";
    	}
    }
}


