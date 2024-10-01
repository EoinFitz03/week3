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

    @GetMapping("/calculate")
    public String getcalculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation ){

    switch(operation){

        case "add":
            return "operation " +operation+ "total " +(num1 + num2);


        case "subtract":
            return "operation " +operation+ "total " +(num1 - num2);

        case "divide":
            if(num2==0) {
            return "Cannot divide by zero";
        }
            return "operation " +operation+ "total " +(num1/num2);


        case "multiply":
            return "operation " +operation+ "total " +(num1*num2);

        default: return "Error";


    }


    }

}
