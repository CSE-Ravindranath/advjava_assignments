package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/addCustomer")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "addCustomer";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute Customer customer) {
        service.saveCustomer(customer);
        return "redirect:/customers";
    }
  
    @GetMapping("/customers")
    public String viewCustomers(Model model) {
        model.addAttribute("customers", service.getAllCustomers());
        return "customerList";
    }
}
