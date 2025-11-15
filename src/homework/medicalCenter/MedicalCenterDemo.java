package homework.medicalCenter;

import java.util.Scanner;

public class MedicalCenterDemo {

    private DoctorStorage doctorStorage = new DoctorStorage();
    private PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) {
        new MedicalCenterDemo().runMedicalCenterMenu();
    }

    public void runMedicalCenterMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Commands.printCommands();
            String choice = scanner.nextLine();

            switch (choice) {
                case Commands.EXIT: {
                    System.out.println("Exit...");
                    return;
                }

                case Commands.ADD_DOCTOR: {
                    addDoctor();
                    break;
                }

                case Commands.SEARCH_DOCTOR_BY_PROFESSION: {
                    searchDoctorByProfession();
                    break;
                }

                case Commands.DELETE_DOCTOR_BY_ID: {
                    deleteDoctorById();
                    break;
                }

                case Commands.CHANGE_DOCTOR_BY_ID: {
                    changeDoctorById();
                    break;
                }

                case Commands.ADD_PATIENT: {
                    addPatient();
                    break;
                }

                case Commands.PRINT_ALL_PATIENTS_BY_DOCTORS: {
                    printAllPatientsByDoctor();
                    break;
                }

                case Commands.PRINT_ALL_PATIENTS: {
                    printAllPatients();
                    break;
                }

                default: {
                    System.out.println("Սխալ ընտրություն, փորձեք կրկին");
                    break;
                }
            }
        }
    }

    private void addDoctor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Մուտքագրեք doctorId:");
        String id = scanner.nextLine();
        System.out.println("Մուտքագրեք name:");
        String name = scanner.nextLine();
        System.out.println("Մուտքագրեք surname:");
        String surname = scanner.nextLine();
        System.out.println("Մուտքագրեք email:");
        String email = scanner.nextLine();
        System.out.println("Մուտքագրեք phoneNumber:");
        String phone = scanner.nextLine();
        System.out.println("Մուտքագրեք profession:");
        String profession = scanner.nextLine();

        Doctor doctor = new Doctor(id, name, surname, email, phone, profession);
        doctorStorage.addDoctor(doctor);
        System.out.println("Բժիշկը ավելացվեց:");
        System.out.println(doctor);
    }

    private void searchDoctorByProfession() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Մուտքագրեք profession որոնելու համար:");
        String prof = scanner.nextLine();
        System.out.println("Գտնված բժիշկները՝");
        for (int i = 0; i < doctorStorage.getDoctorCount(); i++) {
            Doctor d = doctorStorage.getDoctor(i);
            if (d.getPosition().equalsIgnoreCase(prof)) {
                System.out.println(d);
            }
        }
    }

    private void deleteDoctorById() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Մուտքագրեք doctorId ջնջելու համար:");
        String id = scanner.nextLine();
        doctorStorage.deleteDoctorById(id);
        System.out.println("Ջնջման գործողությունը կատարվել է (եթե բժիշկը գոյություն ուներ)");
    }

    private void changeDoctorById() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Մուտքագրեք doctorId թարմացնելու համար:");
        String id = scanner.nextLine();
        Doctor doc = doctorStorage.getDoctorById(id);
        if (doc != null) {
            System.out.println("Մուտքագրեք նոր name:");
            doc.setName(scanner.nextLine());
            System.out.println("Մուտքագրեք նոր surname:");
            doc.setSurname(scanner.nextLine());
            System.out.println("Մուտքագրեք նոր email:");
            doc.setEmail(scanner.nextLine());
            System.out.println("Մուտքագրեք նոր phoneNumber:");
            doc.setPhoneNumber(scanner.nextLine());
            System.out.println("Մուտքագրեք նոր profession:");
            doc.setPosition(scanner.nextLine());

            System.out.println("Բժիշկը թարմացվեց:");
            System.out.println(doc);
        } else {
            System.out.println("Բժիշկը չի գտնվել։");
        }
    }

    private void addPatient() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ընտրեք doctorId patient-ը գրանցելու համար:");
        for (int i = 0; i < doctorStorage.getDoctorCount(); i++) {
            System.out.println(doctorStorage.getDoctor(i));
        }

        String docId = scanner.nextLine();
        Doctor selectedDoctor = doctorStorage.getDoctorById(docId);

        if (selectedDoctor != null) {
            System.out.println("Մուտքագրեք patientId:");
            String pid = scanner.nextLine();
            System.out.println("Մուտքագրեք name:");
            String pname = scanner.nextLine();
            System.out.println("Մուտքագրեք surname:");
            String psurname = scanner.nextLine();
            System.out.println("Մուտքագրեք phone:");
            String phone = scanner.nextLine();
            System.out.println("Մուտքագրեք registerDatetime (double):");
            double datetime = scanner.nextDouble();
            scanner.nextLine();

            Patient patient = new Patient(pid, pname, psurname, phone, selectedDoctor.getDoctorId(), datetime);
            patientStorage.addPatient(patient);
            System.out.println("Հիվանդը գրանցվեց:");
            System.out.println(patient);
        } else {
            System.out.println("Բժիշկը չի գտնվել։");
        }
    }

    private void printAllPatientsByDoctor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Մուտքագրեք doctorId՝ բոլոր հիվանդները ցուցադրելու համար:");
        String docId = scanner.nextLine();
        Doctor d = doctorStorage.getDoctor(0001);
        if (d != null) {
            System.out.println("Բժիշկ՝ " + d.getName() + " " + d.getSurname());


            for (int i = 1; i <= 1000; i++) {
                Patient p = patientStorage.getPatient(i);

                if (p != null && p.getDoctor().equals(d.getDoctorId())) {
                    System.out.println(p);
                }
            }
        } else {
            System.out.println("Բժիշկը չի գտնվել:");
        }
    }
    private void printAllPatients() {

        System.out.println("=== ԲՈԼՈՐ ՀԻՎԱՆԴՆԵՐԸ ===");


        for (int i = 1; i <= 1000; i++) {
            Patient p = patientStorage.getPatient(i);
            if (p != null) {
                System.out.println(p);
            }
        }
    }
}
