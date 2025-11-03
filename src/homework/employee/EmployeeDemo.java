package homework.employee;

import java.util.Scanner;

import static homework.employee.Commands.*;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            Commands.printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    running = false;
                    break;

                case ADD_EMPLOYEE:
                    addEmployee();
                    break;

                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.print();
                    break;

                case SEARCH_EMPLOYEE_BY_ID:
                    System.out.println("Please input ID:");
                    String id = scanner.nextLine();
                    employeeStorage.searchEmployeeByID(id);
                    break;

                case SEARCH_EMPLOYEE_BY_COMPANY:
                    System.out.println("Please input company:");
                    String company = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompany(company);
                    break;

                case SEARCH_EMPLOYEES_BY_POSITION_LEVEL:
                    System.out.println("Enter position level (JUNIOR, MIDDLE, SENIOR, LEAD):");
                    String levelInput = scanner.nextLine();
                    employeeStorage.searchEmployeesByPositionLevel(levelInput);
                    break;

                default:
                    System.out.println("Wrong command! Try again.");
            }
        }
    }

    private static void addEmployee() {
        System.out.println("Please input Employee Name:");
        String name = scanner.nextLine();

        System.out.println("Please input Employee SurName:");
        String surname = scanner.nextLine();

        System.out.println("Please input Employee ID:");
        String employeeID = scanner.nextLine();

        System.out.println("Please input Employee salary:");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.println("Please input Employee company:");
        String company = scanner.nextLine();

        System.out.println("Please input Employee position:");
        String position = scanner.nextLine();

        System.out.println("Please input Employee level (JUNIOR, MIDDLE, SENIOR, LEAD):");
        String levelInput = scanner.nextLine();
        Employee.PositionLevel level;
        try {
            level = Employee.PositionLevel.valueOf(levelInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid position level! Employee not added.");
            return;
        }

        Employee employee = new Employee(name, surname, employeeID, salary, company, position, level);
        employeeStorage.add(employee);
        System.out.println("Employee added successfully!");
    }
}