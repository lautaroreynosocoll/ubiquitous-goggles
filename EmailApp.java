/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailapp;

/**
 *
 * @author lauta
 */
public class EmailApp {
    public static void main (String[] args){
        Email em1 = new Email("Lautaro", "ReynosoColl");
        System.out.print(em1.showInfo());
    }
}
