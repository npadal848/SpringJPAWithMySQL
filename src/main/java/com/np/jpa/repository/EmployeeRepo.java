package com.np.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.np.jpa.entity.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long>{

}
