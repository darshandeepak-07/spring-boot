package com.spring.security.model;

public class Employee {
    private String name;
    private String employeeId;
    private String contactNumber;

    public Employee(String name, String employeeId, String contactNumber) {
        this.name = name;
        this.employeeId = employeeId;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
