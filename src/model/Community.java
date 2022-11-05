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
public class Community{
    private int zipcode;
    private String communityname;
    private ArrayList<House> allhouses;
    private ArrayList<Hospital>allhospitals;
    private Hospital hospital;
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    public ArrayList<House> getAllhouses() {
        return allhouses;
    }

    public void setAllhouses(ArrayList<House> allhouses) {
        this.allhouses = allhouses;
    }

    public ArrayList<Hospital> getAllhospitals() {
        return allhospitals;
    }

    public void setAllhospitals(ArrayList<Hospital> allhospitals) {
        this.allhospitals = allhospitals;
        this.city = city;
    }

    //private Community communities;
    //private City city;
    //private House house;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Community() {
        this.zipcode = 0;
        this.communityname = "";
        this.allhouses = new ArrayList<>();
        this.allhospitals = new ArrayList<>();
    }
    
    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        System.out.println("setCom");
        this.communityname = communityname;
    }

    
   
    public ArrayList<House> getHouses() {
        return allhouses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.allhouses = houses;
    }
   

    public House addNewHouse(){

        House newHouse = new House();
        // set attr for house
        allhouses.add(newHouse);
        return newHouse;
    }        

    public void deleteHouse(House ms) {
        allhouses.remove(ms);
    }                
    
    public Hospital addNewHosp(){

    Hospital newHosp = new Hospital();
    allhospitals.add(newHosp);
    System.out.println("array size of hospitals " + allhospitals.size());    
    return newHosp;
    }          
    public ArrayList<House> searchHouse(String house1)
    {
        ArrayList<House> searchHouse = new ArrayList();
        for(House hs1: allhouses)
        {
            if(hs1.getAddress().toLowerCase().equals(house1.toLowerCase()))
            {
           
                searchHouse.add(hs1);
               
            }
        }
        return searchHouse;
    }   
    
   public boolean checkhouseid(int id)
    {
        ArrayList<House> searchHouse = new ArrayList();
        for(House hse: allhouses)
        {
            if(hse.getHouseno()==id)
            {

                searchHouse.add(hse);
               
            }
        }
        if(searchHouse.isEmpty()){
            
            return false;
        }else{
            return true;
        }
        //return searchEmployee;
    }          
    
    @Override  
    public String toString(){
        return communityname;
    }        
    
}
