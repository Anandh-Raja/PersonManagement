package com.taspro.PersonManageMent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taspro.PersonManageMent.model.Customer;
import com.taspro.PersonManageMent.model.Dependent;
import com.taspro.PersonManageMent.repo.CustomerRepository;
import com.taspro.PersonManageMent.repo.DependentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    //private final CustomerRepository customerRepository;
	 @Autowired
	    private CustomerRepository customerRepository;
	    
	    @Autowired
	    private DependentRepository dependentRepository;
	    
	    public Customer saveCustomerWithDependents(Customer customer) {
	        List<Dependent> dependents = customer.getDependents();
	        
	        // Set the customer for each dependent
	        for (Dependent dependent : dependents) {
	            dependent.setCustomers(customer);
	        }
	        
	        // Save customer along with its dependents
	        customer = customerRepository.save(customer);
	        
	        return customer;
	    }
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // CRUD operations for Customer entity

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long kycId) {
        Optional<Customer> customerOptional = customerRepository.findById(kycId);
        return customerOptional.orElse(null);
    }

    public Customer createOrUpdateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long kycId) {
        customerRepository.deleteById(kycId);
    }
    public void deleteCustomerById(Long kycId) {
        customerRepository.deleteByKycId(kycId);
    }
    

//    public List<Dependent> getAllDependentsForCustomer(Customer customer) {
//        return customerRepository.findAllByCustomer(customer);
//    }
//
//    public Dependent getDependentByIdForCustomer(Long dependentId, Customer customer) {
//        return customerRepository.findDependentByDependentIdAndCustomer(dependentId, customer);
//    }

   
}
