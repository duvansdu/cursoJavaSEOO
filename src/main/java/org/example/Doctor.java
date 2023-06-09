package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Doctor extends  User{
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAvaliableAppointments(ArrayList<AvaliableAppointment> avaliableAppointments) {
        this.avaliableAppointments = avaliableAppointments;
    }

    private String especialidad;


    Doctor(String nombre, String email){
        super(nombre, email);
        System.out.println("El nombre del doctor asignado  es"+ nombre  );
        this.especialidad = especialidad;


    }




    ArrayList<AvaliableAppointment> avaliableAppointments = new ArrayList<>();
    public void addAvaliableAppoinment(Date date, String time){
            avaliableAppointments.add(new Doctor.AvaliableAppointment(date, time));
    }
    public ArrayList<AvaliableAppointment> getAvaliableAppointments(){
        return avaliableAppointments;
    }


    public static class AvaliableAppointment {
        private int id_avaliableAppoinment;
        private Date date;
        private String time;

        public AvaliableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_avaliableAppoinment() {
            return id_avaliableAppoinment;
        }

        public void setId_avaliableAppoinment(int id_avaliableAppoinment) {
            this.id_avaliableAppoinment = id_avaliableAppoinment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }


}

