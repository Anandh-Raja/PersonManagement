package com.taspro.PersonManageMent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.taspro.PersonManageMent.model.Customer;
import com.taspro.PersonManageMent.service.CustomerService;

import java.util.List;

//@RestController
//@RequestMapping("/api/customers")
//public class CustomerController {
//
//    private final CustomerService customerService;
//    @PostMapping("/with-dependents")
//    public ResponseEntity<Customer> saveCustomerWithDependents(@RequestBody Customer customer) {
//        Customer savedCustomer = customerService.saveCustomerWithDependents(customer);
//        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
//    }
//    
//    @Autowired
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Customer>> getAllCustomers() {
//        List<Customer> customers = customerService.getAllCustomers();
//        return new ResponseEntity<>(customers, HttpStatus.OK);
//    }
//
//    @GetMapping("/{kycId}")
//    public ResponseEntity<Customer> getCustomerById(@PathVariable Long kycId) {
//        Customer customer = customerService.getCustomerById(kycId);
//        if (customer != null) {
//            return new ResponseEntity<>(customer, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
//        Customer createdCustomer = customerService.createOrUpdateCustomer(customer);
//        System.out.println(createdCustomer);
//        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{kycId}")
//    public ResponseEntity<Customer> updateCustomer(@PathVariable Long kycId, @RequestBody Customer customer) {
//        Customer existingCustomer = customerService.getCustomerById(kycId);
//        if (existingCustomer != null) {
//            customer.setKycId(kycId); // Ensure the ID is set
//            Customer updatedCustomer = customerService.createOrUpdateCustomer(customer);
//            return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/{kycId}")
//    public ResponseEntity<Void> deleteCustomer(@PathVariable Long kycId) {
//        Customer existingCustomer = customerService.getCustomerById(kycId);
//        if (existingCustomer != null) {
//            customerService.deleteCustomer(kycId);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//   
//}
@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public String getAllCustomers(Model model) {
        List<Customer> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @GetMapping("/{kycId}")
    public String getCustomerById(@PathVariable Long kycId, Model model) {
        Customer customer = customerService.getCustomerById(kycId);
        if (customer != null) {
            model.addAttribute("customer", customer);
            return "customer";
        } else {
            return "error"; // Create an error.html page for handling 404
        }
    }

    @GetMapping("/create")
    public String showCreateCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/save")
    public String saveOrUpdateCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.createOrUpdateCustomer(customer);
        return "redirect:/customers/all";
    }
    /*@GetMapping("/update/{kycId}")
    public String showUpdateCustomerForm(@PathVariable Long kycId, Model model) {
        Customer existingCustomer = customerService.getCustomerById(kycId);
        if (existingCustomer != null) {
            model.addAttribute("customer", existingCustomer);
            return "customer-update";
        } else {
            return "error"; // Create an error.html page for handling 404
        }
    }

    @PostMapping("/update/{kycId}")
    public String updateCustomer(@PathVariable Long kycId, @ModelAttribute("customer") Customer updatedCustomer) {
        updatedCustomer.setKycId(kycId); // Ensure the ID is set
        customerService.createOrUpdateCustomer(updatedCustomer);
        return "redirect:/customers/all";
    }

    @PostMapping("/delete/{kycId}")
    public String deleteCustomer(@PathVariable Long kycId) {
        customerService.deleteCustomer(kycId);
        return "redirect:/customers/all";
    }*/
    
    @GetMapping("/update/{kycId}")
    public String showUpdateCustomerForm(@PathVariable Long kycId, Model model) {
        Customer existingCustomer = customerService.getCustomerById(kycId);
        if (existingCustomer != null) {
            model.addAttribute("customer", existingCustomer);
            return "customer-update";
        } else {
            return "error"; // Create an error.html page for handling 404
        }
    }

    @PostMapping("/update/{kycId}")
    public String updateCustomer(@PathVariable Long kycId, @ModelAttribute("customer") Customer updatedCustomer) {
        updatedCustomer.setKycId(kycId); // Ensure the ID is set
        customerService.createOrUpdateCustomer(updatedCustomer);
        return "redirect:/customers/all";
    }
    @PostMapping("/delete/{kycId}")
    public String deleteCustomer(@PathVariable Long kycId) {
        customerService.deleteCustomer(kycId);
        return "redirect:/customers/all";
    }
  

    
}