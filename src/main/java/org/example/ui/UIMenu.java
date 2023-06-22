package org.example.ui;

import org.example.model.Doctor;
import org.example.model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("model.Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }
    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alejandrom@mail.com"));
        doctors.add(new Doctor("Carlos Hernandez", "carlosh@mail.com"));
        doctors.add(new Doctor("Javier Sanchez", "javiersanchez@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("CARLOS", "cart@gmail.com"));
        patients.add(new Patient("andres Suarez", "weerqw@gmail.com"));
        patients.add(new Patient("Javier Zuluga", "javierZuluaga@gmail.com"));


        boolean emailCorrect = false;
        do{
            System.out.println("Ingresa Correo Electronico: [a@a.com]");
            Scanner sc2 = new Scanner(System.in);
            String email = sc2.nextLine();
            if(userType ==1){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email))
                    {
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        //ShowDoctorMenu
                    }
                }
            }
            if(userType ==2){
                for(Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                    }
                }
            }
        }while(!emailCorrect);
    }


    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                  break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
