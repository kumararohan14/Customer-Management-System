package edu.icet.Controller;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/name")
    public String get(){
        return "Rohan";
    }
    @GetMapping("/age")
    public Integer getAge(){
        return 18;
    }
    @GetMapping("/get-customer")
    public Customer getCustomer(){
        return new Customer("1",
                "Rohan",
                "Anuradhapura",
                5000.00);
    }
    @GetMapping("get-all")
    public List<Customer> getAll(){
       return customerService.getAll();
    }
}
