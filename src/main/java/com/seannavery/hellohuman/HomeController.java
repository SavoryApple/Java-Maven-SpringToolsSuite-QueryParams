package com.seannavery.hellohuman;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
//    @RequestMapping("/")
//    public String index(
//    		@RequestParam(value="name", required=false) String firstName,
//    		@RequestParam(value="last_name", required=false) String lastName) {
//    	if(firstName != null && lastName != null) {	
//    		return "You searched for: " + firstName + " " + lastName;
//    	}
//    	else {
//    		return "Hello human!";
//    	}
//    }
	@RequestMapping("/daikichi/travel/{city}")
    public String index(@PathVariable("city") String city) {
    		return "congratulations, you will soon travel to " + city + "!";
    }
    
    @RequestMapping("/daikichi/lotto/{integer}")
    public String index(@PathVariable("integer") Integer integer) {
    	if(integer %2 == 0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers";
    	}
    	else {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	}
    }
}


