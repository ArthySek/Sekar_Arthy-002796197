/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.MainSystem;
import java.util.ArrayList;

/**
 *
 * @author arthy
 */
public class City{

    private String cityname;
    private int cityId;
    private Community community;
    private ArrayList<Community> allcommunities;    
    private ArrayList<Hospital> allhospitals;

    public ArrayList<Hospital> getAllhospitals() {
        return allhospitals;
    }

    public void setAllhospitals(ArrayList<Hospital> allhospitals) {
        this.allhospitals = allhospitals;
    }
    
    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public ArrayList<Community> getAllcommunities() {
        return allcommunities;
    }

    public void setAllcommunities(ArrayList<Community> allcommunities) {
        this.allcommunities = allcommunities;
    }

//    public ArrayList<Hospital> getAllhosp() {
//        return allhospitals;
//    }
//
//    public void setAllhosp(ArrayList<Hospital> hospdir) {
//        this.allhospitals = hospdir;
//    }
//    
//    public ArrayList<Community> getCommunity1() {
//        return allcommunities;
//    }
//
//    public void setCommunity1(ArrayList<Community> Community1) {
//        this.allcommunities = Community1;
//    }
    //private House house;
    public City() {
        this.cityname = "";
        this.cityId = 0;
        this.allcommunities = new ArrayList<>();
        this.allhospitals = new ArrayList<>();
        //this.community = "";
    }

//    public House getHouse() {
//        return house;
//    }
//
//    public void setHouse(House house) {
//        this.house = house;
//    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        
        this.community = community;
    }


    
//    public City() {
//        this.Community = new Community();
//    }
    
    public String getName() {
        return cityname;
    }

    public void setName(String Name) {
        this.cityname = Name;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public Community addCommunity(){

        Community newCommunity = new Community();
        allcommunities.add(newCommunity);
        System.out.println("array size " + allcommunities.size());
        return newCommunity;
    }        

    
    public void deleteCommunity(Community ms) {
        allcommunities.remove(ms);
    }            

    public void deleteHospital(Hospital ms) {
        allhospitals.remove(ms);
    }   
    
    public ArrayList<Community> searchCommunity(String comm1)
    {
        ArrayList<Community> searchCommunity = new ArrayList();
        for(Community comm: allcommunities)
        {
            if(comm.getCommunityname().toLowerCase().equals(comm1.toLowerCase()))
            {

                searchCommunity.add(comm);

            }
        }
        return searchCommunity;
    }     
    
    public Hospital addNewHosp(){

    Hospital newHosp = new Hospital();
    allhospitals.add(newHosp);
    System.out.println("array size of hospitals " + allhospitals.size());    
    return newHosp;
    }             
    
    
    public ArrayList<Hospital> searchHospital(String hosp)
    {
        ArrayList<Hospital> searchHospital = new ArrayList();
        for(Hospital hs1: allhospitals)
        {
            if(hs1.getHospitalName().toLowerCase().equals(hosp.toLowerCase()))
            {
           
                searchHospital.add(hs1);
               
            }
        }
        return searchHospital;
    }


    
//    @Override  
//    public String toString(){
//        return City.super.getCity().getCityname();
//    }        
    
    
    public boolean checkcommid(int id)
    {
        ArrayList<Community> searchComm= new ArrayList();
        for(Community cty: allcommunities)
        {
            if(cty.getZipcode()==id)
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

    public boolean checkHospid(int id)
    {
        ArrayList<Hospital> searchComm= new ArrayList();
        for(Hospital cty: allhospitals)
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
    
    
    
    @Override  
    public String toString(){
        return cityname;
    }        
}
