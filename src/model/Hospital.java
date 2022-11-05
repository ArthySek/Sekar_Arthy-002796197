/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arthy
 */
public class Hospital extends Community{
    private String HospitalName;
    private int HospitalId;
    private String HospitalAdd;
    private Community community;

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    public Hospital(){
    this.HospitalName = "";
    this.HospitalId = 0;
}
    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public int getHospitalId() {
        return HospitalId;
    }

    public void setHospitalId(int HospitalId) {
        this.HospitalId = HospitalId;
    }

    public String getHospitalAdd() {
        return HospitalAdd;
    }

    public void setHospitalAdd(String HospitalAdd) {
        this.HospitalAdd = HospitalAdd;
    }

    @Override  
    public String toString(){
        return HospitalName;
    }     
    
}
