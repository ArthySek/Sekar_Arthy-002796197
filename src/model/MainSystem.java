/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

/**
 *
 * @author abhis
 */
public class MainSystem {
    //private String MainSystem;
    private City city;
    //private HospitalDirectory hospdir;
    private DoctorDirectory doctordir;
    private PatientDirectory patientdir;
    private PersonDirectory persondir;
    private House Hse;
    private Community comm;
    private Hospital hospital;
   
    public MainSystem(){
        this.city = new City();
        this.doctordir = new DoctorDirectory();
        this.allcities = new ArrayList<City>();
        this.persondir = new PersonDirectory();
        this.patientdir = new PatientDirectory();
    }
    public Hospital gethospital() {
        return hospital;
    }

    public void sethospital(Hospital hospital) {
        this.hospital = hospital;
    }
    //private Community Community;
    // directory -
    private ArrayList<City> allcities;
    

    
    public Community getComm() {
        return comm;
    }

    public void setComm(Community comm) {
        this.comm = comm;
    }


    public House getHse() {
        return Hse;
    }

    public void setHse(House Hse) {
        this.Hse = Hse;
    }

    public DoctorDirectory getDoctordir() {
        return doctordir;
    }

    public void setDoctordir(DoctorDirectory doctordir) {
        this.doctordir = doctordir;
    }

    public PatientDirectory getPatientdir() {
        return patientdir;
    }

    public void setPatientdir(PatientDirectory patientdir) {
        this.patientdir = patientdir;
    }

    public PersonDirectory getPersondir() {
        return persondir;
    }

    public void setPersondir(PersonDirectory persondir) {
        this.persondir = persondir;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public City addnewCity(){

        City newCity = new City();
        allcities.add(newCity);
        return newCity;
    }               

    public ArrayList<City> getAllcities() {
        return allcities;
    }

    public void setAllcities(ArrayList<City> allcities) {
        this.allcities = allcities;
    }
              
    public void deleteCity(City ms) {
        allcities.remove(ms);
    }       

    

    public ArrayList<City> searchCity(String city1)
    {
        ArrayList<City> searchCity = new ArrayList();
        for(City city: allcities)
        {
            if(city.getCityname().toLowerCase().equals(city1.toLowerCase()))
            {
           
                searchCity.add(city);
               
            }
        }
        return searchCity;
    }        
    
    public boolean checkCityid(int id)
    {
        ArrayList<City> searchCity = new ArrayList();
        for(City cty: allcities)
        {
            if(cty.getCityId()==id)
            {

                searchCity.add(cty);
               
            }
        }
        if(searchCity.isEmpty()){
            
            return false;
        }else{
            System.out.println("THE ID MATCH iS " +searchCity.get(0).getCityId());            
            return true;
        }
        //return searchEmployee;
    }  
    
    
    
}



