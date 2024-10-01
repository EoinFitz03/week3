package ie.atu.week3cicd1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
