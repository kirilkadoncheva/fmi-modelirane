package modelirane.visualizationapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/charts")
public class SimpleController {

    @GetMapping("/windspeed")
    public String hello()
    {
        return "Hello!";
    }
}
