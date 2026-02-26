package ie.atu.week2_sem2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello") //endpoint
    public String hello(){
        return "hello world";
    }
@GetMapping("/greet/{name}") // curly brackets link to Path variable
    public String greetByName(@PathVariable String name){ //@PathVariable scans URL
        return "Hello " +name;
    }
}
