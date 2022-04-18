package com.company;

public class Employee {
    public String empDesig;
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;

    public Employee() {
    }

    void displayEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("================");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee MaritalStatus:" + maritalStatus);
    }
}
