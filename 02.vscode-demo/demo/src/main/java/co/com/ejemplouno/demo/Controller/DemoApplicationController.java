package co.com.ejemplouno.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController {
    @RequestMapping("/")
    public String hola(){
        return "Hola Mundo!";
    }
}
