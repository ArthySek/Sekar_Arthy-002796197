/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author abhis
 */
public class DoctorDirectory {
    private ArrayList<Doctor> alldoctor;

    
    public DoctorDirectory(){
        this.alldoctor = new ArrayList<Doctor>();
    }
    
    public ArrayList<Doctor> getAlldoctor() {
        return alldoctor;
    }

    public void setAlldoctor(ArrayList<Doctor> alldoctor) {
        this.alldoctor = alldoctor;
    }


    public Doctor addNewDoc(){

    Doctor newDoc = new Doctor();
    alldoctor.add(newDoc);
    return newDoc;
    
    }      

    public void deleteDoc(Doctor ms) {
        alldoctor.remove(ms);
    }     

    public ArrayList<Doctor> searchDoctor(String city1)
    {
        ArrayList<Doctor> searchDoctor = new ArrayList();
        for(Doctor city: alldoctor)
        {
            if(city.getDocname().toLowerCase().equals(city1.toLowerCase()))
            {
           
                searchDoctor.add(city);
               
            }
        }
        return searchDoctor;
    }    


    public boolean checkDocid(int id)
    {
        ArrayList<Doctor> searchDoc = new ArrayList();
        for(Doctor cty: alldoctor)
        {
            if(cty.getDocid()==id)
            {

                searchDoc.add(cty);
               
            }
        }
        if(searchDoc.isEmpty()){
            
            return false;
        }else{
            return true;
        }
        //return searchEmployee;
    }   
    
}
