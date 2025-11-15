package homework.medicalCenter;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size = 0;

    public void addPatient(Patient patient) {
        if (size == patients.length) {
            extend();

        }
        patients[size++] = patient;
    }

    private void extend() {
        Patient[] newArray = new Patient[patients.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = patients[i];

        }
        patients = newArray;

    }

    public Patient getPatient(int index) {
        if (index >= 0 && index < size) {
            return patients[index];
        }
        return null;
    }

    public Patient getbyId(String Idcard) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getPatientId().equals(Idcard))
                return patients[i];

        }
        return null;
    }

    public void deleteById(String Idcard) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getPatientId().equals(Idcard)) {
                for (int j = 0; j < size - 1; j++) {
                    patients[j] = patients[j + 1];

                }
                patients[--size] = null;
            }
            return;

        }

    }

    public void printall() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);

        }
    }

    public void update(String Idcard, double newdata) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getPatientId().equals(Idcard)) {


            }
        }
    }

    public void printAll() {

    }
}
