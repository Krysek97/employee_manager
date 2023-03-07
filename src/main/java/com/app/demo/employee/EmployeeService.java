package com.app.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee add(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> all(){
        return employeeRepository.findAll();
    }

    public void deleteById (Long id){
        employeeRepository.deleteById(id);
    }


}
