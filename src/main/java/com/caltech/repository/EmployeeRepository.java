package com.caltech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caltech.pojo.Employee;

@Repository                                                    //POJO,ID type
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}

