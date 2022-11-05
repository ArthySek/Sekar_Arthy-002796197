/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author arthy
 */
public class Encounter {
    
    private Date encounterdate;//id also , doctor object ,comments 
    private String encountercomments;
    private int encounterid;
    private VitalSigns vs;

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }

    public Encounter(){
        this.encountercomments = "";
        //this.encounterdate = "";
        this.encounterid = 0;
        this.vs = vs;
    }
    

    public String getEncountercomments() {
        return encountercomments;
    }

    public void setEncountercomments(String encountercomments) {
        this.encountercomments = encountercomments;
    }

    public int getEncounterid() {
        return encounterid;
    }

    public void setEncounterid(int encounterid) {
        this.encounterid = encounterid;
    }

    public Date getEncounterdate() {
        return encounterdate;
    }

    public void setEncounterdate(Date encounterdate) {
        this.encounterdate = encounterdate;
    }

//    public VitalSigns addNewVs(){
//
//    VitalSigns newVs = new VitalSigns();
//    //System.out.println(houseName + " in addC");
//    // set attr for house
//    vs.add(newVs);
//    return newVs;
//    }      
    
}
