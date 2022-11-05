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
public class Patient{
    private String Name;
    private int patienid;
    private Long contactinfo;
    private EncounterHistory enchis;
    private ArrayList<Encounter> Encdir;  

    public Patient(){
        this.Name = "";
        this.Encdir = new ArrayList<>();
    }
    
    public ArrayList<Encounter> getEncdir() {
        return Encdir;
    }

    public void setEncdir(ArrayList<Encounter> Encdir) {
        this.Encdir = Encdir;
    }

    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPatienid() {
        return patienid;
    }

    public void setPatienid(int patienid) {
        this.patienid = patienid;
    }

    public Long getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(Long contactinfo) {
        this.contactinfo = contactinfo;
    }

    public EncounterHistory getEnchis() {
        return enchis;
    }

    public void setEnchis(EncounterHistory enchis) {
        this.enchis = enchis;
    }

    public Encounter addEncounter(){

    Encounter newEnc = new Encounter();
    Encdir.add(newEnc);
    return newEnc;
    
    }       

    @Override  
    public String toString(){
        return Name;
    }     
    
}
