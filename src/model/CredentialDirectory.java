/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Credentials;
import java.util.ArrayList;

/**
 *
 * @author abhis
 */
public class CredentialDirectory{
    private ArrayList<Credentials> credential;    
    
    public CredentialDirectory(){
        this.credential = new ArrayList<Credentials>();
    }        

    public ArrayList<Credentials> getCredential() {
        return credential;
    }

    public void setCredential(ArrayList<Credentials> credential) {
        this.credential = credential;
    }

    public Credentials addNewCredentials(){

    Credentials newcred = new Credentials();
    credential.add(newcred); 
    return newcred;
    
    }       

    public ArrayList<Credentials> searchCredentials(String username,String password, String role)
    {
        ArrayList<Credentials> searchCredentials = new ArrayList();
        for(Credentials credentials1: credential)
        {
            if(credentials1.getUsername().equals(username) && credentials1.getPassword().equals(password) && credentials1.getRole().equals(role))
            {
           
                searchCredentials.add(credentials1);
               
            }
        }
        return searchCredentials;
    }    

    public boolean checkSysAdminCred(String username,String password, String role){
        System.out.println("Hey man youre in" + password + " " + username + " " + role);          
        if(username.equals("admin") && password.equals("fd2556b9dd") && role.equals("System Admin")){
            return true;
        }
        else{
            return false;
        }
            
    }
    
    public boolean checkCommAdminCred(String username,String password, String role)
    {
        System.out.println("FUNCTION " + username + " " + password);
        ArrayList<Credentials> searchCredentials = new ArrayList();
        System.out.println("FUNCTION " + username + " " + password + " ");
        //System.out.println(credential.);
        for(Credentials credentials1: credential)
        {
            System.out.println("DURING THE FOR LOOP" + credentials1.getUsername() + " " + credentials1.getPassword());
            if(credentials1.getUsername().equals(username) && credentials1.getPassword().equals(password) && credentials1.getRole().equals(role))
            {
                System.out.println("WE ARE ADDING YOUR STUFF "+ credentials1.getRole());
                searchCredentials.add(credentials1);
               
            }
        }
        if(searchCredentials.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean checkHospAdminCred(String username,String password, String role)
    {
        System.out.println("FUNCTION " + username + " " + password);
        ArrayList<Credentials> searchCredentials = new ArrayList();
        System.out.println("FUNCTION " + username + " " + password + " ");
        //System.out.println(credential.);
        for(Credentials credentials1: credential)
        {
            System.out.println("DURING THE FOR LOOP" + credentials1.getUsername() + " " + credentials1.getPassword());
            if(credentials1.getUsername().equals(username) && credentials1.getPassword().equals(password) && credentials1.getRole().equals(role))
            {
                System.out.println("WE ARE ADDING YOUR STUFF "+ credentials1.getRole());
                searchCredentials.add(credentials1);
               
            }
        }
        if(searchCredentials.isEmpty()){
            return false;
        }else{
            return true;
        }
    }    
    
}
