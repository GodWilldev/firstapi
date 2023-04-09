package com.openclassrooms.firstapi.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.firstapi.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}