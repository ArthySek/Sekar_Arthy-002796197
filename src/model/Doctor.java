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
public class Doctor {
    private String docname;
    private int docid;
    private Long docnos;
    private String docspeciality;
    private ArrayList<VitalSigns> vs;        
    private Hospital hsp;

    public Hospital getHsp() {
        return hsp;
    }

    public void setHsp(Hospital hsp) {
        this.hsp = hsp;
    }
    
    public ArrayList<VitalSigns> getVs() {
        return vs;
    }

    public void setVs(ArrayList<VitalSigns> vs) {
        this.vs = vs;
    }

    public Doctor(){
        this.docid = 0;
        this.docname = "";
        this.docnos = 0L;
        this.docspeciality = "";
        this.vs = new ArrayList<>();
        this.hsp = hsp;
    }
    
    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public int getDocid() {
        return docid;
    }

    public void setDocid(int docid) {
        this.docid = docid;
    }

    public Long getDocnos() {
        return docnos;
    }

    public void setDocnos(Long docnos) {
        this.docnos = docnos;
    }

    public String getDocspeciality() {
        return docspeciality;
    }

    public void setDocspeciality(String docspeciality) {
        this.docspeciality = docspeciality;
    }

    
        
    public VitalSigns addNewVs(){

    VitalSigns newVs = new VitalSigns();
    vs.add(newVs);
    return newVs;
    
    }  

    @Override  
    public String toString(){
        return docname;
    } 
    
}
