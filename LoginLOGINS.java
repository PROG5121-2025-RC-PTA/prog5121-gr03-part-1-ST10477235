/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_assignment_part2;

/**
 *
 * @author VUNINI
 */
public class LoginLOGINS {
    
     private String username;
    private String password;
    private String storedUsername;
    private String storedPassword;

    public LoginLOGINS(String username, String password) {
        this.storedUsername = username;
        this.storedPassword = password;
    }



    // Validate username: must contain "_" and be between 5 to 12 characters.
    public boolean isValidUsername(String username) {
        return username.contains("_") && username.length() >= 5 && username.length() <= 12;
    }

    // Validate password complexity with improved regex constraints.
    public boolean isValidPassword(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@!$#^%&()+_{}\\-=\\[\\]|:;'\",.<>/?]).{8,}$");
    }

    // Validate South African cellphone number format.
    public boolean isValidCellphoneNumber(String cellNumber) {
        return cellNumber.matches("^(\\+27|0)[6-8]\\d{8}$");
    }

    // Registration confirmation message.
  public String returnRegisteredUser(boolean success) {
    return success ? "Registration successful!" : "Registration failed.";
}

    // Validate user login credentials.
    public boolean isUserValid(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    // Return login status message.
   
    
    public boolean loginUser(String username, String password) {
    // Validate input (e.g., check against stored credentials)
    return username.equals(storedUsername) && password.equals(storedPassword);
}

    // Validate first and last names for alphabetical characters only.
    public boolean isValidName(String firstName, String lastName) {
        return firstName.matches("[a-zA-Z]+") && lastName.matches("[a-zA-Z]+");
    }

    String ReturnregisteredUser(boolean registrationSuccess) {
    return registrationSuccess ? "Registration successful!" : "Registration failed.";
}


}
    

