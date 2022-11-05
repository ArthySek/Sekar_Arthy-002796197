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
public class House extends Community{
    private String Address;
    private String Area;
    private int houseno;
    private Community community; 

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public House() {
        this.Address = "";
        this.Area = "";
        this.houseno = 0;
        this.community = community;
    }    
    
    
    public int getHouseno() {
        return houseno;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    //private Community Community;
    private Person person;
    
//    public Community getCommunity() {
//        return Community;
//    }
//
//    public void setCommunity(Community Community) {
//        this.Community = Community;
//    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    @Override  
    public String toString(){
        return Address;
    }        
    
}
