/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author arthy
 */
public class PatientDirectory{
    private ArrayList<Patient> allpatient;    
    private EncounterHistory enchis;
    
    
    public PatientDirectory(){
        this.allpatient = new ArrayList<>();
        this.enchis = enchis;
    }    

    public ArrayList<Patient> getAllpatient() {
        return allpatient;
    }

    public void setAllpatient(ArrayList<Patient> allpatient) {
        this.allpatient = allpatient;
    }
    public void deletePatient(Patient ms) {
        allpatient.remove(ms);
    }    
    public Patient addNewPatient(){

    Patient newpatient = new Patient();
    //System.out.println(houseName + " in addC");
    // set attr for house
    allpatient.add(newpatient);
    return newpatient;
    }          

    public boolean checkPatientd(int id)
    {
        ArrayList<Patient> searchPat = new ArrayList();
        for(Patient cty: allpatient)
        {
            if(cty.getPatienid()==id)
            {

                searchPat.add(cty);
               
            }
        }
        if(searchPat.isEmpty()){
            
            return false;
        }else{
            return true;
        }
        //return searchEmployee;
    }   

    
}
