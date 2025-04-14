/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog_poe_part1;

/**
 *
 * @author VUNINI
 */
   public class LoginLOGINS {
       public static void main (String[]args){
}


    private Object password;
    private Object username;

    

    public boolean CheckUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean CheckPasswordComplexity(String password) {
        return password.matches("^(?=.[0-9])(?=.[A-Z])(?=.[@!$#^%&()+_{}\\-=\\[\\]|:;'\",.<>/?]).{8,}$");//(Meta AI, 2024)//{8,}$"
    }

    public boolean CheckCellphoneNumber(String cellnumber) {
        return cellnumber.matches("^\\+27\\d{9}$") || cellnumber.matches("^0\\d{9}$");//(Meta AI, 2024)//("^\\+27\\d{9}$")
    }

    public String ReturnregisteredUser(boolean isRegistered) {
        if (isRegistered) {
            return "CONGRATULATIONS,YOU ARE NOW SUCCESSFULLY REGISTERED WITH US";
        } else {
            return "REGISTRATION UNSUCCESSFULL";
        }
     }
    
    public boolean LoggingUser(String Logusername,String Logpassword) {
        return Logusername.equals(username)&& Logpassword.equals(password);
    }
    public String ReturnLogStatus(boolean isLoggedIn) {
    if (isLoggedIn){
            return "ACCESS GRANTED";
    }else{
        return "ACCESS DENIED";
    }
    }
public boolean CheckFandLNames(String firstname,String lastname){
        return firstname.matches("[a-zA-Z]+")&& lastname.matches("[a-zA-z]+");//(Meta AI, 2024)//>[a-zA-Z]
    }
}
     

    

