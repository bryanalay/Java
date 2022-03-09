    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import static UI.UIMenu.*; //con * se importa todos los metodos de la calse UIMenu
import java.util.Date;
import model.Doctor;
import model.Patient;
//con static despues del import no sera necesario poner el "UIMenu." antes del showMenu(); para llamar al metodo.
//el static aumenta le alcence de la clase -- en este caso de package a package----

/**
 * @author Ryzen 3 *

 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Doctor myDoctor = new Doctor("Bryan", "bryan@gmail.com");
          myDoctor.setPhoneNumber("0123456789");
          myDoctor.setAddress("Avenida Doctores NO");
          myDoctor.setSpeciality("Nutriologo");
          myDoctor.addAvaliableAppointment(new Date(),"4pm");
          myDoctor.addAvaliableAppointment(new Date(),"10am");
          myDoctor.addAvaliableAppointment(new Date(),"1pm");
    //          System.out.println(myDoctor.getAvaliableAppointment());
          System.out.println("11-----------------------------------------11");
          System.out.println(myDoctor.getName()+" "+myDoctor.getEmail());
          
        for (Doctor.AvaliableAppointment aA : myDoctor.getAvaliableAppointment()) {
            System.out.println(aA.getDate()+" "+aA.getTime());
        }
        
        System.out.println("11-------------------------------------------------11");
        System.out.println("esto es el metodo toString: "+myDoctor.toString());
        
        
        Patient patient =new Patient("Paco Loco", "Pacoloco123@gmail.com");
        patient.setAddress("Mikasa kill");
        patient.setPhoneNumber("0987654321");
        patient.setBirthday("25/89/2001");
        patient.setWeight(3.2);
        patient.setHeight(24.3);
        patient.setBlood("O+");
        patient.socotrocotoco("si es socotroco");
        System.out.println(patient.toString());
        System.out.println("22------------------------------------------------22");
        System.out.println(patient.getName()+" "+patient.getEmail());        
        System.out.println("2-------------------------------------------------2");
        System.out.println("toString de patient con patient.toString"+patient);
        System.out.println("33--------------------------------------------------33");
        System.out.println(myDoctor);
//        myDoctor.name = "Alejandro Dominguez";
//        myDoctor.showName();
//        myDoctor.showId();
//        System.out.println(Doctor.id);
          
//        Doctor myDoctorBry = new Doctor("Bryan","Software Ingenier");
//        myDoctorBry.showId();
//        System.out.println(Doctor.id);
//        System.out.println(myDoctorBry.getName);
//        System.out.println(myDoctorBry.speciality);
//        showMenu();
        
//        Patient myPatient = new Patient("Paco","paco@gmail.com",0);
//        System.out.println("...................................................");
//        myPatient.setName("paco");
//        myPatient.setPhoneNumber("09809456");
//        myPatient.setWeight(54.6);
//        System.out.println(myPatient.getName());
//        System.out.println(myPatient.getPhoneNumber());
//        System.out.println(myPatient.getWeight());
    }
}
