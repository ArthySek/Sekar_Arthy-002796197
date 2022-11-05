/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author abhis
 */
public class VitalSigns {

    private Float bp;
    private Float bt;
    private Float rr;


    public VitalSigns(){
        this.bp = 0.0f;
        this.bt = 0.0f;
        this.rr = 0.0f;
    }
    
    public Float getBp() {
        return bp;
    }

    public void setBp(Float bp) {
        this.bp = bp;
    }

    public Float getBt() {
        return bt;
    }

    public void setBt(Float bt) {
        this.bt = bt;
    }

    public Float getRr() {
        return rr;
    }

    public void setRr(Float rr) {
        this.rr = rr;
    }
    
}
