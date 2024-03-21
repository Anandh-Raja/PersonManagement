package com.taspro.PersonManageMent.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taspro.PersonManageMent.model.Customer;
import com.taspro.PersonManageMent.model.Dependent;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAll();

    Customer findByKycId(Long kycId);
    void deleteByKycId(Long kycId);
    // You can define more custom methods here based on your requirements

    // For Dependent entity
    //List<Dependent> findAllByCustomer(Customer customer);

   // Dependent findDependentByDependentIdAndCustomer(Long dependentId, Customer customer);
}

