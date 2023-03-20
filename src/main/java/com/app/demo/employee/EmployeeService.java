package com.app.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

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

    public Optional<Employee> byId(Long id){
        return employeeRepository.findById(id);
    }

    public void deleteById (Long id){
        employeeRepository.deleteById(id);
    }


}
