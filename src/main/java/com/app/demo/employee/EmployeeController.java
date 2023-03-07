package com.app.demo.employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }

    @GetMapping("/all")
    public List<Employee> all() {
        return employeeService.all();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        employeeService.deleteById(id);
    }

//    @PostMapping

}
