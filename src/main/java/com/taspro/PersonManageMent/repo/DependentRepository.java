package com.taspro.PersonManageMent.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taspro.PersonManageMent.model.Dependent;

@Repository
public interface DependentRepository extends JpaRepository<Dependent, Long> {

}
