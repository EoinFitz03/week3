package ie.atu.week3cicd1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class week3 {
    @GetMapping("/message")
    public String getMessage(){

        return "some Message";
    }

    @GetMapping("/details")
    public String getDetails(){

        return "some other Message";

    }

    @GetMapping("/hello/{name}")
    public String getName(@PathVariable String name){

        return "Your name is"+name;

    }

    @GetMapping("/detail")
    public String getdetail(@RequestParam String name, @RequestParam int age ){

        return  "name" +name + "age" + age;

    }

}
