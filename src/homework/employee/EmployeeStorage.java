package homework.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;

    }

    private void extend() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void SearchEmployeeByID(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeID().equals(id)) {
                System.out.println(employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not with" + id + "not Employee");
        }


    }

    public void SearchEmployeeByCompany(String company) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equals(company)) {
                System.out.println(employees[i]);
                found = true;
            }

        }
        if (!found) {
            System.out.println(" with this company " + company + " not Employee ");

        }
    }



}







