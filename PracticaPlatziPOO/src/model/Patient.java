/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ryzen 3
 */
public class Patient extends User{
  
    
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    private String socotroco;
    
    
    public Patient(String name,String email){
        super(name,email);
    }
    
//    

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getAddres() {
//        return addres;
//    }
//
//    public void setAddres(String addres) {
//        this.addres = addres;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }

//    public void setPhoneNumber(String phoneNumber) {
//        if (phoneNumber.length()>8 ) {
//            System.out.println("El numero debe ser de 8 digitos maximo");
//        }else if (phoneNumber.length() == 8) {
//            this.phoneNumber = phoneNumber;
//        }        
//    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight + " KG.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " KG.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString()+"\nAge: " +birthday
                +"\nWeight: "+getWeight()
                +"\nHeight: "+ getHeight()
                +"\nBlood Type: "+ blood
                +"\n¿Es socotroco?: "+ socotroco
        +"\n-------------------------------"; 
    }
    
    public String socotroco(){
        return socotroco;
    }
    
    public void socotrocotoco(String socotrocotoco){
        this.socotroco = socotrocotoco;
    }
}
