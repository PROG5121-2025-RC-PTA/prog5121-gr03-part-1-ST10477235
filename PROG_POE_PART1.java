/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_poe_part1;

import javax.swing.JOptionPane;

/**
 *
 * @author VUNINI
 */
public class PROG_POE_PART1 {

    private static boolean validUsername;
    private static boolean validPassword;
    private static boolean validCellnumber;
    private static boolean validFandLname;
    private static String Logusername;
    private static String Logpassword;
    private static boolean isLoggedIn;
    

    public static void main(String[] args)
    {
         System.out.println("Welcome to my P.O.E") ;
         System.out.println("*******************");
                
    {
        
        
        
     //QUESTION 1A OF PART 1//
       //Declaring the variables first name and last name that will be used to welcome user and login//
    
    String firstname = "Vunene";
    String lastname = "Hlungwani";
    boolean CheckFandLNames = false;
    while (!validFandLname )
        
    {
    firstname = JOptionPane.showInputDialog("Step 1: Enter your first name");//this will be used to welcome the user in the login part
    lastname = JOptionPane.showInputDialog("Step 2: Enter your Last Name");//this will be used to welcome the user in the login
    System.out.println(firstname);
    System.out.println(lastname);
    
    
    if (firstname==null|| lastname==null)
    {
         JOptionPane.showMessageDialog(null, "You cancelled your application the system will restart"
                + "\n If you want to register again youll have to start afresh ", "Canceled", JOptionPane.INFORMATION_MESSAGE);
        return; 
    }
        else if (firstname.trim().isEmpty()||lastname.trim().isEmpty())//i couldn't say fisrtname.equals because it checks for space instead so i modifed it to isEmpty
    {
        JOptionPane.showMessageDialog(null,"First name and last name is not entered","Invalid", JOptionPane.ERROR_MESSAGE);//since we need it to wellcome user it can not be empty 
    }
        else   if (firstname.matches("[a-zA-Z]+") && lastname.matches("[a-zA-Z]+"))
    {
       JOptionPane.showMessageDialog(null,"First name and Last name sucessfully captured");  
       validFandLname = true;
    }
        else
      {
          JOptionPane.showMessageDialog(null,"First name or Lastname not entered\nPlease ensure that your:\n "
                  + "*names consist of letters\n*no space in between\n*and both their are entered fields ");
      }
    }
     
        //Displaying messages according to how they met the criteria//
     
                //Condition for valid username//
    
    String username = "nu_";
    boolean CheckUsername = false;
    while (!validUsername)
    {
    username = JOptionPane.showInputDialog("Username\n Your username must contains an underscore and should not be more than five characters long");
    System.out.println(username);//as it will be printed to the console we will be able to see when we have entered wrong username
    if (username==null)
    {
        JOptionPane.showMessageDialog(null, "You cancelled your application the system will restart"
                + "\n If you want to register again youll have to start afresh ", "Canceled", JOptionPane.INFORMATION_MESSAGE);
        return; //i changed system(0) because it would exit the whole system which is inconvinent
    }
      else if (username.trim().isEmpty())
     {
         JOptionPane.showMessageDialog(null,"Username not entered","Invalid", JOptionPane.ERROR_MESSAGE);
     } 
      else if (username.contains("_") && username.length()<=5)
     {
     JOptionPane.showMessageDialog(null,"Username successfully captured.");
     validUsername = true;
     }
     else 
     {
     JOptionPane.showMessageDialog(null,"Username is not correctely formatted."
     + "Please ensure that your username contains an underscore and is no more than five characters long.");
     }
}
     
                //Condition for correctely formatted password//  
    
     String password = "@#Vun3n3";
     boolean CheckPasswordComplexity = false;
     while (!validPassword)
     {
      password = JOptionPane.showInputDialog("Enter your password");
      System.out.println(password);
       if (password==null)//without the null when i press cancel the build would be false
    {
        JOptionPane.showMessageDialog(null, "You cancelled your application the system will restart"
                + "\n If you want to register again you'll have to start afresh ", "Canceled", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
        else if  (password.trim().isEmpty())
     {
         JOptionPane.showMessageDialog(null,"Password not entered","Invalid", JOptionPane.ERROR_MESSAGE);
     }  
      else if (password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@!$#^%*&()+_{}\\-=\\[\\]|:;'\",.<>/?]).{8,}$"))//(Meta AI, 2024)//>^(?=.*[0-9])(?=.*[A-Z]){8,}$"
     {
     JOptionPane.showMessageDialog(null,"P@ssw0rd succ3sfully c@ptur3d.");
     validPassword = true;
     }
    else
     {
      JOptionPane.showMessageDialog(null,"Password is not correctely formated.\n"
             +"Please ensure that the password:\n"//the \n will make it much easier to read because the condition is long
             +"*Contains atleast 8 charaters.\n"
             +"*Includes atleast 1 uppercase letter\n"
             +"*Includes atleast 1 number.\n"
          +"*Includes atleast 1 special character.");
     }
     }
       
    //QUESTION 1B OF PART 1//
                //Condition for vailid South African number
//Citation:///Meta AI. (2024). Java code snippet for validating South African cell phone numbers [Code].//

      String cellnumber = "0837136930";
      boolean CheckCellphoneNumber = false;
      while (!validCellnumber)
      { 
    cellnumber =
   
   JOptionPane.showInputDialog("Enter South African cell number\n *Your number should include(+27) or start with 0 and should not be more or less than 10 digits*");
     System.out.println(cellnumber);
      if (cellnumber==null)
    {
        JOptionPane.showMessageDialog(null, "You cancelled your application the system will restart"
                + "\n If you want to register again youll have to start afresh ", "Canceled", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    else if  (cellnumber.trim().isEmpty())
     { 
          JOptionPane.showMessageDialog(null,"Cell phone number is not entered","Invalid", JOptionPane.ERROR_MESSAGE);
     }
  else if ((cellnumber.matches("^\\+27\\d{9}$"))) //(Meta AI, 2024)//
    {
     JOptionPane.showMessageDialog(null,"Cellphone succesfully added!");
     String defaultMessage = "Welcome to ChatApp! We are glad to have you here.";
     JOptionPane.showMessageDialog(null, "Message sent to " + cellnumber + ": " + defaultMessage);
     JOptionPane.showMessageDialog(null, "Message received: Hello from ChatApp!");
     JOptionPane.showMessageDialog(null, "Message read: Hello from ChatApp!");
     validCellnumber = true;
    }
   else if (cellnumber.matches("^0\\d{9}$"))//(Meta AI, 2024)//
    {
     JOptionPane.showMessageDialog(null,"Cell phone sucessfully added!" + "(Note: International format is +27)");
     String defaultMessage = "Welcome to ChatApp! We are glad to have you here.";
     JOptionPane.showMessageDialog(null, "Message sent to " + cellnumber + ": " + defaultMessage);//(Meta AI, 2024)//
     JOptionPane.showMessageDialog(null, "Message received:Your registration code is"+"******");
     JOptionPane.showMessageDialog(null, "Message read:"+defaultMessage);//(Meta AI, 2024)//
    validCellnumber = true;
    }
   else
     {
    JOptionPane.showMessageDialog(null,"Invalid,cell phone number incorrectly formatted or does not contain international code.");
    }
      }
   
   if (CheckUsername(username)&&CheckPasswordComplexity(password)&&CheckCellphoneNumber(cellnumber)
           &&CheckFandLNames(firstname,lastname)
           &&ReturnregisteredUser(username,password,cellnumber,firstname,lastname))
           {
           LoginLOGINS instance = new LoginLOGINS(); 
        String registrationMessage = instance.ReturnregisteredUser(true); 
        JOptionPane.showMessageDialog(null, registrationMessage); 
        System.out.println(registrationMessage); 

   
           }
   else {
             LoginLOGINS instance = new LoginLOGINS(); 
        String registrationMessage = instance.ReturnregisteredUser(false); 
        JOptionPane.showMessageDialog(null, registrationMessage); 
        System.out.println(registrationMessage); 
        }
   



    //QUESTION 2 OF PART 1//
                //logging into the account using//
   Logusername= "nu_"; 
   Logpassword = "@#Vun3n3";
   boolean ReturnLogStatus = false;
   while (!isLoggedIn)
   {
   String Logusername = JOptionPane.showInputDialog("Log using your,username:\n ");
    System.out.println(Logusername);
   String Logpassword = JOptionPane.showInputDialog("Log using your, passssword:");
    System.out.println(Logpassword);
    if  (Logusername == null || Logpassword == null)
    {
        JOptionPane.showMessageDialog(null, "You cancelled your application the system will restart"
                + "\n If you want to register again youll have to start afresh ", "Canceled", JOptionPane.INFORMATION_MESSAGE);
        return; 
    }
     else if (Logusername.trim().isEmpty()|| Logpassword.trim().isEmpty())
    { 
                JOptionPane.showMessageDialog(null,"Username or password not entered","Invalid", JOptionPane.ERROR_MESSAGE);
    }
     else if (Logusername.equals(username) && Logpassword.equals(password))
    { 
        JOptionPane.showMessageDialog(null,"Welcome"+" "+firstname+" "+lastname+" "+"it is great to see you again" );
   isLoggedIn = true;
   }
    else{
         if ( !Logusername.equals(username) && !Logpassword.equals(password) )
    {  
    JOptionPane.showMessageDialog(null,"Username and password incorrect please try again\nEnsure that you have used the correct username and password");
    }
   else {
            JOptionPane.showMessageDialog(null,"Username or password incorrect please try again\nDouble check!!!");
        }
         }
    if (CheckUsername(username)&&CheckPasswordComplexity(password)&&LoggingUser(username,password))
    {
        String logStatus = ReturnLogStatus(true);
        JOptionPane.showMessageDialog(null,"ACCESS GRANTED");
        isLoggedIn=true;
    }
    else 
    {
    String logStatus = ReturnLogStatus(false);
    JOptionPane.showMessageDialog(null,"ACCESS DENIED");//not desired results the i am missing the logic
    isLoggedIn = false;
    }
    }
    }
    }
    
        

    private static boolean CheckUsername(String username) {
        
        return true;
        
    }

    private static boolean CheckPasswordComplexity(String password) {
       
    
        return true;
       
    
    }

    private static boolean CheckCellphoneNumber(String cellnumber) {
    
        return true;
    
    } 

    private static boolean ReturnregisteredUser(String username, String password, String cellnumber, String firstname, String lastname) {
       
    
        return true;
       
    
    }

    private static boolean CheckFandLNames(String firstname, String lastname) {
        
    
        return true;
        
    
    }

    private static boolean LoggingUser(String username, String password) {
         
    
        return true;
         
    
    }

    private static String ReturnLogStatus(boolean b) {
        
   
        
        
   
        
        
   
        
        
   
        return null;
        
   
        
        
   
        
        
   
        
        
   
    }
}



    

