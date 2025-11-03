package homework.employee;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String employeID;
    private double salary;
    private String company;
    private String position;
    private  PositionLevel level;

    public enum PositionLevel {
        Junior, Middle, Senior, Lead
    }


    public Employee() {
    }

    public Employee(String name, String surname, String employeID, double salary, String company, String position, PositionLevel level) {
        this.name = name;
        this.surname = surname;
        this.employeID = employeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeID() {
        return employeID;
    }

    public void setEmployeID(String employeID) {
        this.employeID = employeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public PositionLevel getLevel() {
        return level;
    }

    public void setLevel(PositionLevel level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(employeID, employee.employeID) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position) && level == employee.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeID, salary, company, position, level);
    }


    @Override
    public String toString() {
        return name + " " + surname + ", ID: " + employeID +
                ", Company: " + company + ", Position: " + position +
                ", Level: " + level;
    }
}


