package homework.medicalCenter;

import java.util.Date;
import java.util.Objects;
import java.util.PrimitiveIterator;

public class Patient {
    private String patientId;
    private String name;
    private String surname;
    private String phone;
    private String Doctor;
    private double registerDatetime;

    public Patient(String patientId, String name, String surname, String phone, String doctor, double registerDatetime) {
        this.patientId = patientId;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        Doctor = doctor;
        this.registerDatetime = registerDatetime;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public double getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(double registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Double.compare(registerDatetime, patient.registerDatetime) == 0 && Objects.equals(patientId, patient.patientId) && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(phone, patient.phone) && Objects.equals(Doctor, patient.Doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, name, surname, phone, Doctor, registerDatetime);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", Doctor='" + Doctor + '\'' +
                ", registerDatetime=" + registerDatetime +
                '}';
    }
}