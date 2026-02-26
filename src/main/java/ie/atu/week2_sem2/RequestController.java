package ie.atu.week2_sem2;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/details") // maps match the endpoint and returns appropriate URL
    public String details(@RequestParam String name, @RequestParam Integer age){
        return "Hello " +name + " " +age;
    }

    @GetMapping("/Person")
    public Person getPerson(){
        Person Person = new Person(21, "Finnya");
        return Person;
    }
    @GetMapping("/addition")
            public Calculate addition(){
        Calculate Calculate = new Calculate(6,2);
    return Calculate;
    }


}

// JSON is a converter used to understand any coding language used (universal).
