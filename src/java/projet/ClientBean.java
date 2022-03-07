/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.Hashtable;
/**
 *
 * @author xplo
 */
public class ClientBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private String mail;
    
    private String first_name;
    
    private String name;

    private String phoneNumber;
    
    private Boolean isRegistered = false;
   


    /**
     * Get the value of isRegistered
     *
     * @return the value of isRegistered
     */
    public Boolean isRegistered() {
        return isRegistered;
    }

    /**
     * Set the value of isRegistered
     *
     * @param isRegistered new value of isRegistered
     */
    public void setRegister(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

 

    /**
     * Get the value of phoneNumber
     *
     * @return the value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the value of phoneNumber
     *
     * @param phoneNumber new value of phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Get the value of first_name
     *
     * @return the value of first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * Set the value of first_name
     *
     * @param first_name new value of first_name
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    /**
     * Get the value of mail
     *
     * @return the value of mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Set the value of mail
     *
     * @param mail new value of mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

}
