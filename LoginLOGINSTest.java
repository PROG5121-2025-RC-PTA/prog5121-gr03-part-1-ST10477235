/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prog_poe_part1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author VUNINI
 */
public class LoginLOGINSTest {
    
    public LoginLOGINSTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

 

    
    @Test
    public void testCheckUsername() {
        System.out.println("CheckUsername");
        String username = "kyle!!!";
        LoginLOGINS instance = new LoginLOGINS();
        boolean expResult = false;
        boolean result = instance.CheckUsername(username);
        assertEquals(expResult, result);
     
       
    }

    
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("CheckPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        LoginLOGINS instance = new LoginLOGINS();
        boolean expResult = false;
        boolean result = instance.CheckPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testCheckCellphoneNumber() {
        System.out.println("CheckCellphoneNumber");
        String cellnumber = "0717850897";
        LoginLOGINS instance = new LoginLOGINS();
        boolean expResult = true;
        boolean result = instance.CheckCellphoneNumber(cellnumber);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testReturnregisteredUser() {
        System.out.println("ReturnregisteredUser");
        boolean isRegistered = false;
        LoginLOGINS instance = new LoginLOGINS();
        String expResult =" REGISTRATION UNSUCCESSFULL";
        String result = instance.ReturnregisteredUser(isRegistered);
        assertEquals("REGISTRATION UNSUCCESSFULL", result);
      
    }

  
    @Test
    public void testLoggingUser() {
        System.out.println("LoggingUser");
        String username = "nu";
        String password = "@N3ptun3";
        LoginLOGINS instance = new LoginLOGINS();
        boolean expResult = false;
        boolean result = instance.LoggingUser(username, password);
        assertEquals(expResult,result);
        
    }

    
    @Test
    public void testReturnLogStatus() {
        System.out.println("ReturnLogStatus");
        boolean isLoggedIn = false;
        LoginLOGINS instance = new LoginLOGINS();
        String expResult = "ACCESS DENIED";
        String result = instance.ReturnLogStatus(isLoggedIn);
        assertEquals(expResult, result);
        
        
    }

  
    @Test
    public void testCheckFandLNames() {
        System.out.println("CheckFandLNames");
        String firstname = "Naptune";
        String lastname = "";
        LoginLOGINS instance = new LoginLOGINS();
        boolean expResult = true;
        boolean result = instance.CheckFandLNames(firstname, lastname);
        assertEquals(false, result);
        
        
    }
    
}
