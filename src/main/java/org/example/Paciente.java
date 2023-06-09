package org.example;

public class Paciente extends User{
   //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    Paciente(String name, String email){
        super(name, email);
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + "kg.";
    }

    public String getHeight() {
        return height + "Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
