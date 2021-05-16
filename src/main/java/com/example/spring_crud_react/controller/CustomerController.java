package com.example.spring_crud_react.controller;

import com.example.spring_crud_react.model.Customer;
import com.example.spring_crud_react.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @GetMapping("/")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return repo.findAll();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return repo.findById(id).orElse(null);
    }

    @PostMapping("/customer/add")
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return repo.save(customer);
    }

    @PutMapping("/customer/update")
    public Customer updateCustomer(@RequestBody Customer customer)
    {
        Customer oldCustomer = repo.findById(customer.getId()).orElse(null);
        oldCustomer.setFirstName(customer.getFirstName());
        oldCustomer.setLastName(customer.getLastName());
        oldCustomer.setEmail(customer.getEmail());
        oldCustomer.setIdNumber(customer.getIdNumber());
        return repo.save(oldCustomer);
    }

    @DeleteMapping("/customer/delete/{id}")
    public Integer deleteCustomer(@PathVariable Long id)
    {
        repo.deleteById(id);
        return 1;
    }
}
