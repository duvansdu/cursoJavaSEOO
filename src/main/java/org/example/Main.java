package org.example;

import java.util.Date;

import static org.example.ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        /*Doctor myDoctor = new Doctor();
        myDoctor.nombre = "Duvan Leal";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorDuvanLeal = new Doctor();
        myDoctorDuvanLeal.nombre   = "Carlos Sanchez";
        myDoctorDuvanLeal.showName();
        myDoctorDuvanLeal.showId();*/

       //showMenu();
        Doctor myDoctor = new Doctor(" Duvan Leal", "Medicina General");
        myDoctor.addAvaliableAppoinment(new Date(), "4pm");
        myDoctor.addAvaliableAppoinment(new Date(), "10pm");
        myDoctor.addAvaliableAppoinment(new Date(), "1pm");

        for (Doctor.AvaliableAppointment aA: myDoctor.getAvaliableAppointments()) {
            System.out.println(aA.getDate() + " "+ aA.getTime());
            
        }


        Paciente myPaciente = new Paciente("Carlos Sanchez", "carlos@gmail.com");
        myPaciente.setWeight(54.6);
        System.out.println(myPaciente.getWeight());
        System.out.println(myPaciente);

        myPaciente.setPhoneNumber("1234567");
        System.out.println(myPaciente.getPhoneNumber());
    }
}