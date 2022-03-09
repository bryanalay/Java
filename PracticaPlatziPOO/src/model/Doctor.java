package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

   
    private String speciality;
 
    public Doctor(String name,String email){
        super(name, email);
        System.out.println("El nombre del dortor asignado es: " +name);
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEspeciality: "+speciality+"\nAvaliable: "+avaliableAppointment.toString();
    }
    
    
    
//    Doctor(String name){
//        this.name = name;
//        System.out.println("El nombre del doctor asignado es: " + name);
//    }
    //comportamientos-----metodos
    ArrayList<AvaliableAppointment> avaliableAppointment = new ArrayList<>();
    public void addAvaliableAppointment(Date date, String time){
        avaliableAppointment.add(new Doctor.AvaliableAppointment(date, time));
    }
    
    public ArrayList<AvaliableAppointment> getAvaliableAppointment(){
        return avaliableAppointment; 
    }
    
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    //-----------------------------------------------------------
    public static class AvaliableAppointment{
        private int id_avaliableAppointment;
        private Date date;
        private String time;
    //Avaliable appointment

        public AvaliableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_avaliableAppointment() {
            return id_avaliableAppointment;
        }

        public void setId_avaliableAppointment(int id_avaliableAppointment) {
            this.id_avaliableAppointment = id_avaliableAppointment;
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
        
        @Override
        public String toString() {
            return "\nAvaliable Appointment: "+date
                    +"\nTime: "+time+"\n--------------------------------";
        } 
    }     
}
