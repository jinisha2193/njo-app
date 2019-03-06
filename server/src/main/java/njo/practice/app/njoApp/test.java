package njo.practice.app.njoApp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This is a rest controller that is going to route you somewhere (I THINK)
@RestController
public class test {

    //Only for GET request
    //Routing to get information from /hello
    @RequestMapping("/hello")
    @CrossOrigin(origins = "http://localhost:4200")
    public String sayHi() {
        return "Data from spring boot";

    }
}

