package org.example.order.controller;

import jakarta.servlet.http.HttpSession;
import org.example.order.model.Customer;
import org.example.order.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    private final CustomerRepository customerRepository;
    private Customer customerData;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/information")
    public String infoPage(Model model) {
        model.addAttribute("username", "name");
        return "info";
    }

    @PostMapping("/information")
    public String adminLogin(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session, Model model){

        if(customerData != null){
            model.addAttribute("error","You are already signed in!");
            customerData = null;
            session.removeAttribute("user");
            session.removeAttribute("customer");
            return "genericFailure";
        }

        Customer customer = customerRepository.findCustomerByEmail(username);
        if(customer != null && password.equals(customer.getPin())){
            customerData = customerRepository.findCustomerByEmail(username);
            session.setAttribute("customer", customer);

            return "redirect:/purchasing";

        }else{
            model.addAttribute("error",
                    "Invalid username or password or not correct login area!");
            return "genericFailure";
        }
    }

    @GetMapping("/purchasing")
    public String getItems(Model model){
        model.addAttribute("customer", customerData);
        System.out.println(customerData);
        return "purchase";
    }

}
