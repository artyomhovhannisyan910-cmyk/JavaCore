package homework.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStorage {
    private List<Employee> employees = new ArrayList<>();

    public void add(Employee emp) {
        employees.add(emp);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void print() {
        if (employees.isEmpty()) {
            System.out.println("No employees yet.");
            return;
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void searchEmployeeByID(String id) {
        boolean found = false;
        for (Employee e : employees) {
            if (e.getEmployeID().equals(id)) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employee found with ID: " + id);
        }
    }

    public void searchEmployeeByCompany(String company) {
        boolean found = false;
        for (Employee e : employees) {
            if (e.getCompany().equalsIgnoreCase(company)) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found in company: " + company);
        }
    }

    public void searchEmployeesByPositionLevel(String levelStr) {
        Employee.PositionLevel level;
        try {
            level = Employee.PositionLevel.valueOf(levelStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid position level: " + levelStr);
            return;
        }

        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getLevel() == level) {
                System.out.println(emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found with level: " + levelStr);
        }
    }
}








