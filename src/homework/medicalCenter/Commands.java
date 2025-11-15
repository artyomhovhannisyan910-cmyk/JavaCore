package homework.medicalCenter;

public interface Commands {
    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTORS = "6";
    String PRINT_ALL_PATIENTS = "7";

    static void printCommands() {
        System.out.println("Plase input " + EXIT + " for EXIT");
        System.out.println("Plase input " + ADD_DOCTOR + " for ADD DOCTOR");
        System.out.println("Plase input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Plase input " + DELETE_DOCTOR_BY_ID + " for DELETE DOCTOR BY ID");
        System.out.println("Plase input " + CHANGE_DOCTOR_BY_ID + " for CHANGE DOCTOR BY ID");
        System.out.println("Please input" + ADD_PATIENT+"for ADD PATIENT");
        System.out.println("Please input" + PRINT_ALL_PATIENTS_BY_DOCTORS+"for PRINT ALL PATIENTS BY DOCTORS");
        System.out.println("Please input" + PRINT_ALL_PATIENTS+"for PRINT ALL PATIENTS ");

    }
}
