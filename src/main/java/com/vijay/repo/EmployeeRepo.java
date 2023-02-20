package com.vijay.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Serializable> {

}
