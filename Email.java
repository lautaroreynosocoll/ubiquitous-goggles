/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String company = "suffix";
    
    // Constructor receives first and last names
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
        // Call a method to ask for department
        this.department = setDepartment();
        
        // Call a method to return a random password
        this.password = randomPassword(defaultPasswordLength);
        
        // Combine elements too generate email
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() +
                "." + this.company + ".com";
    }
    
    // Ask for department
    private String setDepartment(){
        System.out.print("ENTER DEPARTMENT:\n1 FOR SALES\n2 FOR DEVELOPMENT\n3 FOR ACCOUNTING\n0 FOR NONE\n");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){ return "Sales"; }
        else if(depChoice == 2){ return "Development"; }
        else if(depChoice == 3){ return "Accounting"; }
        else { return ""; }
        
    }
    
    // Generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    // Set mailbox capacity
    public void setMailboxCapacity(int capacity){ this.mailboxCapacity = capacity; }
    
    // Set alternate email
    public void setAlternateEmail(String alternateEmail){ this.alternateEmail = alternateEmail; }
    
    // Change password
    public void changePassword(String password){ this.password = password; }
    
    public int getMailbokCapacity(){ return this.mailboxCapacity; }
    
    public String getAlternateEmail(){ return this.alternateEmail; }
    
    public String getPassword(){ return this.password; }
    
    public String showInfo(){
        return "INFORMATION: \nDISPLAY NAME: " + this.firstName + " " + this.lastName +
                "\nCOMPANY EMAIL: " + this.email +
                "\nMAILBOX CAPACITY: " + this.mailboxCapacity + " MB\n";
                }
}
