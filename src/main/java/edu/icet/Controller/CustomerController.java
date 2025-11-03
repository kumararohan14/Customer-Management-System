package edu.icet.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
    @GetMapping
    public String get(){
        return "Rohan";
    }
}
