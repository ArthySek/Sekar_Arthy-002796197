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
public class HospitalDirectory extends City{
    private ArrayList<Hospital> hospdir;

    public ArrayList<Hospital> getHospdir() {
        return hospdir;
    }

    public void setHospdir(ArrayList<Hospital> hospdir) {
        this.hospdir = hospdir;
    }
    
    public HospitalDirectory() {
        this.hospdir = new ArrayList<>();
    }
    
    public Hospital addNewHosp(){
        Hospital newHosp = new Hospital();
        // set attr for hosp
        hospdir.add(newHosp);
        return newHosp;
    }      
    public boolean checkHospid(int id)
    {
        ArrayList<Community> searchComm= new ArrayList();
        for(Hospital cty: hospdir)
        {
            if(cty.getHospitalId()==id)
            {

                searchComm.add(cty);
               
            }
        }
        if(searchComm.isEmpty()){
            
            return false;
        }else{
            return true;
        }
        //return searchEmployee;
    }   

}
