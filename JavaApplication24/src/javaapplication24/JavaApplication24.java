/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author paolo
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    System.out.println("Paolo Mazzocco Student No. sba 24150");
    
    
    
    
    /* This is the path where the file is stored, it is in the same folder of the program*/
    String filePath = "customers.txt";
    
    try {
        BufferedReader br = new BufferedReader (new FileReader (filePath));
        
        
    }
    
    
    catch (IOException e ){
        e. printStackTrace();
        
    
    
        
        
        
        }
    
}

}