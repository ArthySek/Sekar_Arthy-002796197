/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.MainSystem;

/**
 *
 * @author arthy
 */
public class Crudops {
    private ArrayList<MainSystem> crudops1;
    
    public Crudops() {
        this.crudops1 = new ArrayList<MainSystem>();
    }

    public MainSystem addNew(){
        MainSystem newattbs = new MainSystem();
        crudops1.add(newattbs);
        return newattbs;
    }    

    public ArrayList<MainSystem> getCrudops1() {
        return crudops1;
    }

    public void setCrudops1(ArrayList<MainSystem> crudops1) {
        this.crudops1 = crudops1;
    }

    public void deleteEmployee(MainSystem ms) {
        crudops1.remove(ms);
    }            
        
}

