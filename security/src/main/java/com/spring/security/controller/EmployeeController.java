package com.spring.security.controller;

import com.spring.security.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("employee/")
public class EmployeeController {

    private List<Employee> employees = new ArrayList<Employee>(
            List.of(
                    new Employee("Deepak", "01", "13233"),
                    new Employee("Darshan", "02", "4546")
            )
    );

    @GetMapping("")
    public List<Employee> getEmployees() {
        return employees;
    }

    @PostMapping("create/")
    public Employee createEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return employee;
    }
}
