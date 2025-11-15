package homework.medicalCenter;

import java.sql.Array;

public class DoctorStorage {
    private Doctor[] doctors = new Doctor[10];
    private int doctorCount = 0;

    public void addDoctor(Doctor doctor) {
        if (doctorCount == doctors.length) {
            extend();
        }
        doctors[doctorCount++] = doctor;
    }

    private void extend() {
        Doctor[] newArray = new Doctor[doctors.length * 2];
        for (int i = 0; i < doctorCount; i++) {
            newArray[i] = doctors[i];

        }
        doctors = newArray;
    }

    public Doctor getDoctor(int index) {
        if (index >= 0 && index < doctorCount) {
            return doctors[index];


        }
        return null;
    }

    public void add(Doctor doctor) {

    }

    public boolean deleteById(String id) {

        return false;
    }

    public int getDoctorCount() {
        return 0;
    }

    public void deleteDoctorById(String id) {

    }

    public Doctor getDoctorById(String docId) {

        return null;
    }
}
