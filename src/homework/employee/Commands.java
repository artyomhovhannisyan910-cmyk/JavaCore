package homework.employee;

public interface Commands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEE = "2";
    String SEARCH_EMPLOYEE_BY_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY = "4";
    String SEARCH_EMPLOYEES_BY_POSITION_LEVEL= "5";

    static void printCommands() {
        System.out.println("Plase input " + EXIT + " for EXIT");
        System.out.println("Plase input " + ADD_EMPLOYEE + " for ADD EMPLOYEE");
        System.out.println("Plase input " + PRINT_ALL_EMPLOYEE + " for PRINT ALL EMPLOYEE");
        System.out.println("Plase input " + SEARCH_EMPLOYEE_BY_ID + " for SEARCH EMPLOYEE BY ID");
        System.out.println("Plase input " + SEARCH_EMPLOYEE_BY_COMPANY + " for SEARCH EMPLOYEE BY COMPANY");
        System.out.println("Please input" + SEARCH_EMPLOYEES_BY_POSITION_LEVEL + "for SEARCH EMPLOYEES BY POSITION NUMBER");

    }
}
